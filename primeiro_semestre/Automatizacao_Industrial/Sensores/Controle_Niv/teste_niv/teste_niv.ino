const int potPin = A0;
const int lowLevelLed = 2;
const int mediumLevelLed = 3;
const int highLevelLed = 4;

void setup() {
  Serial.begin(9600);
  pinMode(lowLevelLed, OUTPUT);
  pinMode(mediumLevelLed, OUTPUT);
  pinMode(highLevelLed, OUTPUT);
}

void loop() {
  int potValue = analogRead(potPin);
  int levelState = getLevelState(potValue);
  
  switch(levelState) {
    case 0: // Nível baixo
      digitalWrite(lowLevelLed, HIGH);
      digitalWrite(mediumLevelLed, LOW);
      digitalWrite(highLevelLed, LOW);
      Serial.println("Baixo, " + String(potValue));
      break;
    case 1: // Nível médio
      digitalWrite(lowLevelLed, LOW);
      digitalWrite(mediumLevelLed, HIGH);
      digitalWrite(highLevelLed, LOW);
      Serial.println("Médio, " + String(potValue));
      break;
    case 2: // Nível alto
      digitalWrite(lowLevelLed, LOW);
      digitalWrite(mediumLevelLed, LOW);
      digitalWrite(highLevelLed, HIGH);
      Serial.println("Alto, " + String(potValue));
      break;
  }
  
  delay(1000); // Atraso de 1 segundo entre as leituras
}

int getLevelState(int value) {
  if (value < 300) {
    return 0; // Nível baixo
  } else if (value >= 300 && value < 700) {
    return 1; // Nível médio
  } else {
    return 2; // Nível alto
  }
}

