import serial
import time
from openpyxl import Workbook

# Configura a porta serial (ajuste a porta conforme necessário)
serial_port = serial.Serial('COM7', 9600)  # Substitua 'COM3' pela porta serial correta

# Cria uma nova planilha do Excel
wb = Workbook()
ws = wb.active
ws.append(['Data e Hora', 'Valor do Potenciômetro (ADC)', 'Tensão (V)'])

try:
    while True:
        # Lê os dados da porta serial
        pot_value = int(serial_port.readline().decode().strip())  # Converte a string para um inteiro
        
        # Converte o valor do potenciômetro para tensão (0-1023 para 0-5V)
        voltage = pot_value * (5.0 / 1023.0)
        
        # Obtem a data e hora atual
        current_time = time.strftime('%Y-%m-%d %H:%M:%S')
        
        # Escreve os dados na planilha do Excel
        ws.append([current_time, pot_value, voltage])
        
        # Salva a planilha
        wb.save("dados.xlsx")
        
        # Espera 30 segundos
        time.sleep(10)
finally:
    # Fecha a porta serial ao sair do loop
    serial_port.close()

