import socket #biblioteca
import time #biblioteca
HOST = "127.0.0.1" #endereço do servidor
PORT = 5000 #porta qu eo servidor está utilizando
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)#Instan. TCP familia IPv4
dest = (HOST, PORT)
tcp.connect(dest)#conexão via tcp

msg=input('Entre com o valor do contador: ')#Mensagem que será enviada
tcp.send(msg.encode('utf-8'))#Enviando a mensagem
time.sleep(1)#Tempo para envio da mensagem
