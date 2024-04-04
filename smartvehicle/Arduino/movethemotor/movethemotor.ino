//  A connections
const int motorAPin1 = 2;  // Connect to L298N IN1
const int motorAPin2 = 3;  // Connect to L298N IN2
const int motorAEnablePin = 8;  // Connect to L298N ENA
const int motorBPin1 = 4;  // Connect to L298N IN1
const int motorBPin2 = 5;  // Connect to L298N IN2
const int motorBEnablePin = 9;  // Connect to L298N ENA

void setup() {
  // Set motor A control pins as outputs
  pinMode(motorAPin1, OUTPUT);
  pinMode(motorAPin2, OUTPUT);
  pinMode(motorAEnablePin, OUTPUT);
  pinMode(motorBPin1, OUTPUT);
  pinMode(motorBPin2, OUTPUT);
  pinMode(motorBEnablePin, OUTPUT);

}

void moveMotorAForward( ) {
  digitalWrite(motorAPin1, HIGH);
  digitalWrite(motorAPin2, LOW);
  analogWrite(motorAEnablePin, 255);
  
    // Adjust speed by changing the PWM value
 digitalWrite(motorBPin1, HIGH);
  digitalWrite(motorBPin2, LOW);
  analogWrite(motorBEnablePin, 255);
  }
void loop() {
 moveMotorAForward();
  delay(100);
}
