# Importa as bibliotecas necessárias
from flask import Flask, jsonify # Flask para criar o servidor, jsonnify para formatar a resposta em JSON
from flask_cors import CORS # CORS permite que o frontend acesse o servidor Flask
import random # Biblioteca para gerar valores aleátorios (simulação de sensores)
import mysql.connector # Biblioteca para persistir os dados no banco

# Cria a aplicação Flask
app = Flask(__name__)

# Habilita CORS para permitir que o front-end (javaScript) faça requisições ao servidor Flask
CORS(app)

# Função que faz a conexão com o banco de dados
def sql_connection():
    mydb = mysql.connector.connect(
    host='localhost',
    user='Gaban',
    password='1234',
    database='supervisor_sensors'
    )

    return mydb

#Função para simular os dados dos sensores
def get_sensor_data():

    # variável que recebe a função contendo a conexão com o banco
    mydb = sql_connection()

    # Cria um objeto cursor para executar comando SQL (SELECT, INSERT, UPDATE, DELETE)
    cursor = mydb.cursor()

    data = {
       "temperatura":round(random.uniform(20,80),2), # Gera um valor aleatório de temperatura entre 20°C e 80°C
       "umidade":round(random.uniform(30,90),2), # Gera um valor aleatório de umidade entre 30% e 90%
       "pressao":round(random.uniform(20,80),2), # Gera um valor aleatório de pressão entre 900 hPa e 1100 hPa
       "som":round(random.uniform(20,140),2), # Gera um valor aleatório de som entre 20dB e 140dB 
       "vazao":round(random.uniform(30,80),2) # Gera um valor aleatório de vazao entre 20m³/h e 140m³/h
    }
    
    # variavel com o comando sql para inserir no banco
    sql = 'INSERT INTO sensors (TEMPERATURE, HUMIDITY, PRESSURE, SOUND, LEAK) VALUES (%s, %s, %s, %s, %s)'

    #Ele executa o comando sql
    cursor.execute(sql, (data['temperatura'], data['umidade'], data['pressao'], data['som'], data['vazao']))

    # Atualiza o banco com os dados inseridos
    mydb.commit()

    # Fecha a conexão com o banco de dados
    mydb.close()

    return data

    

# Define a rota da API que responderá com os dados dos sensores em formato JSON
@app.route('/sensores',methods=['GET']) # A rota '\sensores' responde apenas a requisições GET
def sensores():
    return jsonify(get_sensor_data()) #Retorna os dados simulados dos sensores em formato JSON


#Executa o servidor Flask apenas se este arquivo dor executado diretamente
if __name__ == '__main__':
    app.run(debug=True) # Inicia o servidor Flask em modo de depuração (debug=True) para facilitar o desenvolvimento
