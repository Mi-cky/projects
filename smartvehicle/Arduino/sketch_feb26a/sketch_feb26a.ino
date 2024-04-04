//  A connections
const int motorAPin1 = 3;  // Connect to L298N IN1
const int motorAPin2 = 4;  // Connect to L298N IN2
const int motorAEnablePin =8;  // Connect to L298N ENA
const int motorBPin1 = 5;  // Connect to L298N IN1
const int motorBPin2 = 6;  // Connect to L298N IN2
const int motorBEnablePin = 9;  // Connect to L298N ENA

// Ultrasonic sensor connections
const int trigPin = 0;  // Connect to the trigger pin on the ultrasonic sensor
const int echoPin = 1;  // Connect to the echo pin on the ultrasonic sensor


// Define the threshold distance for obstacle detection in centimeters
const int obstacleThreshold = 20;

void setup() {
  // Initialize serial communication
  Serial.begin(9600);

  // Set motor A control pins as outputs
  pinMode(motorAPin1, OUTPUT);
  pinMode(motorAPin2, OUTPUT);
  pinMode(motorAEnablePin, OUTPUT);
  pinMode(motorBPin1, OUTPUT);
  pinMode(motorBPin2, OUTPUT);
  pinMode(motorBEnablePin, OUTPUT);

  // Set ultrasonic sensor trigger and echo pins as OUTPUT and INPUT, respectively
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);

}

void moveMotorAForward( ) {
  // Move Motor A forward

  digitalWrite(motorAPin1, HIGH);
  digitalWrite(motorAPin2, LOW);
 analogWrite(motorAEnablePin, 255);
  

 digitalWrite(motorBPin1, HIGH);
  digitalWrite(motorBPin2, LOW);
 analogWrite(motorBEnablePin, 255);
  
  }

void stopMotorA() {
  // Stop Motor A
  digitalWrite(motorAPin1, LOW);
  digitalWrite(motorAPin2, LOW);
  analogWrite(motorAEnablePin, 0);
  digitalWrite(motorBPin1, LOW);
  digitalWrite(motorBPin2, LOW);
  analogWrite(motorBEnablePin, 0);
  
}

void loop() {
  // Trigger the ultrasonic sensor
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);

  // Measure the time it takes for the ultrasonic pulse to return
  long duration = pulseIn(echoPin, HIGH);

  // Calculate the distance in centimeters
  int distance = duration / 58;

  // Check for obstacles
  if (distance < obstacleThreshold) {
       stopMotorA();
  } else {
  //   // If no obstacle, move Motor A forward
  moveMotorAForward();
  }

  // Add a delay before the next measurement
  delay(100);
}
