import serial
import time
from openpyxl import Workbook

# Configura a porta serial (ajuste a porta conforme necessário)
serial_port = serial.Serial('COM7', 9600)  # Substitua 'COM3' pela porta serial correta

# Cria uma nova planilha do Excel
wb = Workbook()
ws = wb.active
ws.append(['Data e Hora', 'Estado do Nível', 'Valor do Potenciômetro'])

try:
    while True:
        # Lê os dados da porta serial
        data = serial_port.readline().decode().strip()
        data_split = data.split(', ')
        current_time = time.strftime('%Y-%m-%d %H:%M:%S')
        
        # Escreve os dados na planilha do Excel
        ws.append([current_time, data_split[0], data_split[1]])
        
        # Salva a planilha
        wb.save("dados.xlsx")
        
        # Espera 1 segundo entre as leituras
        time.sleep(1)
finally:
    # Fecha a porta serial ao sair do loop
    serial_port.close()
