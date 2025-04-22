import serial
import time

# Configura a porta serial (ajuste a porta conforme necessário)
serial_port = serial.Serial('COM7', 9600)  # Substitua 'COM3' pela porta serial correta

# Abre o arquivo de texto para escrita
file_path = 'dados.txt'
with open(file_path, 'w') as file:
    try:
        while True:
            # Lê os dados da porta serial
            data = serial_port.readline().decode().strip()
            
            # Obtém o horário atual
            current_time = time.strftime('%Y-%m-%d %H:%M:%S')
            
            # Escreve os dados no arquivo de texto
            file.write(f'{current_time}, {data}\n')
            file.flush()  # Certifica-se de que os dados são gravados imediatamente no arquivo
            
            # Espera 1 segundo entre as leituras
            time.sleep(1)
    finally:
        # Fecha a porta serial ao sair do loop
        serial_port.close()
