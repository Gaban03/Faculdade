const X_CLASS = 'fa-times';
const O_CLASS = 'fa-circle';
const WINNING_COMBINATIONS = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
];
const cellElements = document.querySelectorAll('[data-cell]');
const board = document.getElementById('board');
const messageElement = document.getElementById('message');
const restartButton = document.getElementById('restartButton');
let circleTurn;

// Adicionar evento de clique em cada célula
cellElements.forEach(cell => {
    cell.addEventListener('click', handleClick, { once: true });
});

function handleClick(e) {
    const cell = e.target;
    const currentClass = circleTurn ? O_CLASS : X_CLASS;
    placeMark(cell, currentClass);
    if (checkWin(currentClass)) {
        endGame(false);
    } else if (isDraw()) {
        endGame(true);
    } else {
        swapTurns();
        setBoardHoverClass();
    }
}

function placeMark(cell, currentClass) {
    const icon = document.createElement('i');
    icon.classList.add('fas', currentClass); // Adiciona a classe do ícone FontAwesome
    cell.appendChild(icon); // Insere o ícone na célula
}

function swapTurns() {
    circleTurn = !circleTurn;
    document.body.style.backgroundColor = circleTurn ? '#ff9999' : '#6fa8dc'; // Alterna cor de fundo
}

function setBoardHoverClass() {
    board.classList.remove(X_CLASS);
    board.classList.remove(O_CLASS);
}

function checkWin(currentClass) {
    return WINNING_COMBINATIONS.some(combination => {
        return combination.every(index => {
            return cellElements[index].firstChild && 
                   cellElements[index].firstChild.classList.contains(currentClass);
        });
    });
}

function isDraw() {
    return [...cellElements].every(cell => {
        return cell.firstChild;
    });
}

function endGame(draw) {
    if (draw) {
        messageElement.innerText = 'Empate!';
    } else {
        messageElement.innerText = `${circleTurn ? "O" : "X"} venceu!`;
    }
    // Bloqueia novas jogadas até o jogo ser reiniciado
    cellElements.forEach(cell => {
        cell.removeEventListener('click', handleClick);
    });
}

restartButton.addEventListener('click', () => {
    cellElements.forEach(cell => {
        cell.innerHTML = ''; // Limpa o conteúdo das células
        cell.addEventListener('click', handleClick, { once: true }); // Permite novo clique
    });
    messageElement.innerText = ''; // Limpa a mensagem de vitória
    document.body.style.backgroundColor = '#6fa8dc'; // Reseta a cor de fundo
});
