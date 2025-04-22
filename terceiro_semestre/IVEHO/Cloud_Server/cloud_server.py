import requests
import random
import time
import csv
import json

api_key = "UWWVC3BLTK30TYWF"

channel_id = "2844647"

value = True

# função para escrever os dados na API
def data_send(temperatura, umidade, pressao):
    while(value):
        url = f'https://api.thingspeak.com/update?api_key={api_key}&field1={temperatura}&field2={umidade}&field3={pressao}'
        resposta = requests.get(url)
        print(f"Resposta: {resposta.text}")
        
        # Chama a função de leitura para que ao escrever os dados na API ele também possa ler estes
        data_read()
        time.sleep(20)

# função para ler os dados da API
def data_read():
        # Faz a consulta na API para ler os dados e armazenar na variável 'response'
        response = requests.get(f'https://api.thingspeak.com/channels/{channel_id}/feeds.json?results=1')
        
        # Pega a resposta em json e armazena na variável data
        data = json.loads(response.content)
        
        # Por meio da variável data ele vai no corpo do json e pega em especifico o corpo feeds
        # e armazena apenas o corpo JSON feeds dentro da variável feeds
        feeds = data['feeds']
        
        # Serve para que eu possa iterar dentro de feeds procurando apenas os valores que eu quero
        # que no caso são Temperatura, Umidade e Pressão Atmosférica
        for x in feeds:
            print(f"Temperatura: {x['field1']}, Umidade: {x['field2']}, Pressão Atmosférica: {x['field3']}")
      
        

def main():
    temperatura = random.uniform(20, 30)
    umidade = random.uniform(50, 70)
    pressao = random.uniform(100, 760)
    data_send(temperatura, umidade, pressao)
    

main()
    
