// Obtém o contexto do elemento <canvas> onde o gráfico será desenhado
const ctx = document.getElementById('sensorChart').getContext('2d');

// Cria um gráfico de linha usando a biblioteca Chart.js
const chart = new Chart(ctx, {
    type: 'line', // Define o tipo de gráfico como linha
    data: {
        labels: [], // Inicialmente, não há rótulos no eixo X (será preenchido com timestamps)
        datasets: [
            { label: 'Temperatura (°C)', data: [], borderColor: 'red', fill: false }, // Linha vermelha para temperatura
            { label: 'Umidade (%)', data: [], borderColor: 'blue', fill: false }, // Linha azul para umidade
            { label: 'Pressão (hPa)', data: [], borderColor: 'green', fill: false }, // Linha verde para pressão
            { label: 'Som (dB)', data: [], borderColor: 'orange', fill: false }, // Linha laranja para som
            { label: 'Vazão (m³/h)', data: [], borderColor: 'yellow', fill: false } // Linha amarela para vazão
        ],
    },
    options: {
        responsive: true, // O gráfico se ajusta ao tamanho da tela
        scales: {
            x: { title: { display: true, text: 'Tempo' } } // Define um título para o eixo X
        }
    }
});

let intervalId = setInterval(atualizarSensores, 2000); // Inicia a leitura automática
let running = true; // Estado inicial da leitura

// Adiciona evento ao botão para pausar/iniciar a leitura dos sensores
document.getElementById("toggleButton").addEventListener("click", function () {
    if (running) {
        clearInterval(intervalId);
        this.innerText = "Iniciar";
    } else {
        intervalId = setInterval(atualizarSensores, 2000);
        this.innerText = "Pausar";
    }
    running = !running;
});

// Função assíncrona para buscar os dados do servidor Flask e atualizar a página
async function atualizarSensores() {
    try {
        // Faz uma requisição para o endpoint do Flask que fornece os dados dos sensores
        const response = await fetch('http://127.0.0.1:5000/sensores');

        // Converte a resposta JSON para um objeto JavaScript
        const data = await response.json();

        // Atualiza os valores exibidos na página
        document.getElementById('temp').innerText = data.temperatura; // Atualiza a temperatura
        document.getElementById('hum').innerText = data.umidade; // Atualiza a umidade
        document.getElementById('pres').innerText = data.pressao; // Atualiza a pressão
        document.getElementById('som').innerText = data.som; // Atualiza o som
        document.getElementById('vaz').innerText = data.vazao; // Atualiza vazão

        // Obtém o horário atual para adicionar ao gráfico
        const now = new Date().toLocaleTimeString();

        // Adiciona um novo ponto no gráfico
        chart.data.labels.push(now); // Adiciona o horário atual ao eixo X
        chart.data.datasets[0].data.push(data.temperatura); // Adiciona temperatura ao gráfico
        chart.data.datasets[1].data.push(data.umidade); // Adiciona umidade ao gráfico
        chart.data.datasets[2].data.push(data.pressao); // Adiciona pressão ao gráfico
        chart.data.datasets[3].data.push(data.som); // Adiciona som ao gráfico
        chart.data.datasets[4].data.push(data.vazao); // Adiciona vazão ao gráfico

        // Mantém apenas os últimos 10 valores no gráfico para evitar sobrecarga
        if (chart.data.labels.length > 10) {
            chart.data.labels.shift(); // Remove o primeiro item da lista de labels
            chart.data.datasets.forEach(dataset => dataset.data.shift()); // Remove os primeiros valores de cada dataset
        }

        // Atualiza o gráfico na tela
        chart.update();

        // Verifica se há alertas para valores críticos
        verificarAlertas(data);
    } catch (error) {
        // Se houver um erro na requisição, exibe no console
        console.error("Erro ao buscar dados:", error);
    }
}

// Função para verificar alertas de valores críticos
function verificarAlertas(data) {
    let alertas = [];

    if (data.temperatura >= 70) alertas.push("Temperatura crítica! (>70°C)");
    if (data.umidade <= 35) alertas.push("Baixa Umidade! (<35%)");
    if (data.pressao <= 30) alertas.push("Pressão muito baixa! (<30 hPa)");
    if (data.som >= 120) alertas.push("Nível de som muito alto! (>120 dB)");
    if (data.vazao <= 40) alertas.push("Vazão muito baixa! (<40 m³/h)");

    if (alertas.length > 0) {
        alert(alertas.join("\n"));
    }
}
