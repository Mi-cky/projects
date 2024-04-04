// Motor A connections
const int motorAPin1 = 2;  // Connect to L298N IN1
const int motorAPin2 = 3;  // Connect to L298N IN2
const int motorAEnablePin = 9;  // Connect to L298N ENA

// Motor B connections
const int motorBPin1 = 4;  // Connect to L298N IN3
const int motorBPin2 = 5;  // Connect to L298N IN4
const int motorBEnablePin = 10;  // Connect to L298N ENB

void setup() {
  // Set motor control pins as outputs
  pinMode(motorAPin1, OUTPUT);
  pinMode(motorAPin2, OUTPUT);
  pinMode(motorAEnablePin, OUTPUT);

  pinMode(motorBPin1, OUTPUT);
  pinMode(motorBPin2, OUTPUT);
  pinMode(motorBEnablePin, OUTPUT);
}

void loop() {
  // Move both motors forward
  digitalWrite(motorAPin1, HIGH);
  digitalWrite(motorAPin2, LOW);
  analogWrite(motorAEnablePin, 255);  // Adjust speed by changing the PWM value

  digitalWrite(motorBPin1, HIGH);
  digitalWrite(motorBPin2, LOW);
  analogWrite(motorBEnablePin, 255);  // Adjust speed by changing the PWM value

  delay(2000);  // Move forward for 2 seconds

  // Stop both motors
  digitalWrite(motorAPin1, LOW);
  digitalWrite(motorAPin2, LOW);
  analogWrite(motorAEnablePin, 0);

  digitalWrite(motorBPin1, LOW);
  digitalWrite(motorBPin2, LOW);
  analogWrite(motorBEnablePin, 0);

  delay(1000);  // Stop for 1 second
}
