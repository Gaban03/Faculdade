// código exemplo para aquisição de sinal de tensão
// Curso Superior de Tecnólogia Faculdade SENAI Adolpho Lobbe
// São Carlos-SP
// Autores: Murilo Herrick Riva de Camargo & Vinicius Brolezzi Gaban

void setup(){
  
  Serial.begin(9600);
}

void loop(){
//Lê o valor do potenciômetro
  int potValue = analogRead(A0);

	//Envia o valor pela porta serial
	Serial.println(potValue);

	delay(1000);//Atraso de 1 segundo entre as leituras
  
}