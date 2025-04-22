import serial
import time

# Configura a porta serial (ajuste a porta conforme necessário)
serial_port = serial.Serial('COM7', 9600)  # Substitua 'COM3' pela porta serial correta

# Cria um arquivo para escrita
file_path = 'dados.txt'
file = open(file_path, 'w')

try:
    while True:
        # Lê os dados da porta serial
        pot_value = serial_port.readline().decode().strip()
        
        # Obtem a data e hora atual
        current_time = time.strftime('%Y-%m-%d %H:%M:%S')
        
        # Escreve os dados no arquivo
        file.write(f'{current_time}, {pot_value}\n')
        file.flush()  # Certifica-se de que os dados são gravados imediatamente no arquivo
finally:
    # Fecha o arquivo e a porta serial ao sair do loop
    file.close()
    serial_port.close()
