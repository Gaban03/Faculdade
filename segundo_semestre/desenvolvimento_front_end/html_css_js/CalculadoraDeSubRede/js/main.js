// Função principal para calcular sub-redes
function calculateSubnets() {
    // Obtém o valor de endereço IP e da quantidade de sub-redes fornecidos pelo usuário
    const ipAddress = document.getElementById("ipAddress").value;
    const subnetCount = parseInt(document.getElementById("subnetCount").value);
    const initialMaskBits = parseInt(document.getElementById("maskBits").value);

       // Referência para as áreas de erro e resultados na página
       const errorMessage = document.getElementById("error-message");
       const resultsDiv = document.getElementById("results");
   
       // Limpa mensagens de erro e resultados anteriores antes de qualquer nova tentativa
       errorMessage.style.display = "none";
       resultsDiv.style.display = "none";

    // Validação do IP e do número de sub-redes
    if (!validateIpAddress(ipAddress) || isNaN(subnetCount) || subnetCount <= 0){
        // Exibe um alerta se o IP for inválido ou o número de sub-redes for inválido ou menor ou igual a zero
        displayError("Por favor, insira um IP válido e uma quantidade de sub-redes maior que zero.");
        return;
    }

    //Verifica se a máscara inicial é válida (entre 8 e 30 bits)
    if(isNaN(initialMaskBits) || initialMaskBits < 8 || initialMaskBits > 30){
        // Exibe um alerta se a máscara não estiver no intervalo válido
        displayError("Por favor, insira uma máscara inicial válida (entre 8 e 30).");
        return;
    }
    // Calcula a quantidade de bits extras necessários para suportar o número desejado de sub-redes
    const bitsRequired = Math.ceil(Math.log2(subnetCount));

    // Calcula a nova máscara de sub-rede somando os bits adicionais à máscara inicial
    const newMaskBits = initialMaskBits + bitsRequired;

    // Verifica se a nova máscara excede o máximo permitido de 32 bits
    if (newMaskBits > 32){
        // Exibe um alerta se a quantidade de sub-redes for muito grande para a máscara inicial
        displayError("A quantidade de sub-redes desejada e muito grande para ser suportada pela máscara inicial.");
        return;
    }
    // Converte o novo número de bits da máscara para a notação decimal de máscara de sub-rede
    const subnetMask = convertCIDRToSubnetMask(newMaskBits);

    // Calcula o número de hosts disponiveis por sub-rede (2^bitsRestantes - 2)
    const bitsForHosts = 32 - newMaskBits; // Bits restantes para hosts
    const hostsPerSubnet = Math.pow(2, bitsForHosts) - 2; // Subtrai 2 para a rede e o endereço de broadcast

    // Exibe os resultados na página
    document.getElementById("subnetMask").innerHTML = `Nova máscara de sub-rede: ${subnetMask} (/ ${newMaskBits})`;
    document.getElementById("hostsPerSubnet").innerHTML = `Hosts por sub-rede: ${hostsPerSubnet}`;
    resultsDiv.style.display = "block"; // Torna os resultados visíveis
}

// Função para exibir mensagens de erro no formato alert do Bootstrap
function displayError(message) {
    // Seleciona a div onde os erros são mostrados e injeta a mensagem de erro
    const errorDiv = document.getElementById("error-message");
    errorDiv.querySelector(".alert").innerHTML = message;
    errorDiv.style.display = "block"; // Mostra a div de erro que estava oculta
}


// Função que válida o endereço IP com uma expressão regular
function validateIpAddress(ip){
    // Expressão regular para verificar se o IP está no formato correto
    const regex = /^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/;
    return regex.test(ip); // Retorna verdadeiro se o IP corresponder as padrão
}

// Adiciona formatação automática ao campo de IP, mas bloqueia a inserção de pontos manuais
document.getElementById('ipAddress').addEventListener('input', function(e) {
    let ip = e.target.value.replace(/[^\d]/g, ''); // Remove qualquer caractere que não seja número
    if (ip.length > 3) ip = ip.substring(0, 3) + '.' + ip.substring(3); // Adiciona o primeiro ponto
    if (ip.length > 7) ip = ip.substring(0, 7) + '.' + ip.substring(7); // Adiciona o segundo ponto
    if (ip.length > 11) ip = ip.substring(0, 11) + '.' + ip.substring(11); // Adiciona o terceiro ponto
    // Limita a entrada a no máximo 15 caracteres (endereço IPv4 padrão: 255.255.255.255)
    e.target.value = ip.substring(0, 15); // Atualiza o campo com a formatação correta
})

// Função que converte a máscara CIDR para a máscara de sub-rede decimal
function convertCIDRToSubnetMask(maskBits) {
    let mask = []; // Array para armazenar os quatro octetos de máscara
    for (let i = 0; i < 4; i++){
        // Calcula quantos bits são usados no octeto atual
        const bits = Math.min(maskBits, 8);
        maskBits -= bits; // Reduz o número de bits restantes
        // Calcula o valor decimal do octeto e adiciona à máscara
        mask.push(256 - Math.pow(2, 8 - bits));
    }
    return mask.join('.') // Junta os octetos para formar a máscara de sub-rede em formato decimal
}