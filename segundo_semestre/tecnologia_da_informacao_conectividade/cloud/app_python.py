import urllib.request
import requests
import time

CHAVE = "KCDCI68X16FBV1XM"
URL ="https://api.thingspeak.com/update?api_key=KCDCI68X16FBV1XM&field1=%s"%CHAVE
x=0
while x<5:
    valor = int(input('Entre com o valor'))
    reposta = urllib.request.urlopen(URL + "&field1=%s" % (valor))
    print(reposta.read())
    reposta.close()
    x=x+1
    time.sleep(15.0)
