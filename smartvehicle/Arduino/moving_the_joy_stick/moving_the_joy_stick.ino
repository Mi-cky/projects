//  A connections
const int motorAPin1 = 2;  // Connect to L298N IN1
const int motorAPin2 = 3;  // Connect to L298N IN2
const int motorAEnablePin = 9;  // Connect to L298N ENA
const int motorBPin1 = 4;  // Connect to L298N IN1
const int motorBPin2 = 5;  // Connect to L298N IN2
const int motorBEnablePin = 10;  // Connect to L298N ENA

// Ultrasonic sensor connections
const int trigPin = 6;  // Connect to the trigger pin on the ultrasonic sensor
const int echoPin = 7;  // Connect to the echo pin on the ultrasonic sensor


// Joystick connections
const int joyXPin = A0;  // Connect to the X-axis pin on the joystick
const int joyYPin = A1;  // Connect to the Y-axis pin on the joystick

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

  // Set joystick pins as INPUT
  pinMode(joyXPin, INPUT);
  pinMode(joyYPin, INPUT);

}

void moveMotorAForward(int speed ) {
  // Move Motor A forward
  if (speed > 0){
  digitalWrite(motorAPin1, HIGH);
  digitalWrite(motorAPin2, LOW);
  // analogWrite(motorAEnablePin, 255);
  
    // Adjust speed by changing the PWM value
 digitalWrite(motorBPin1, HIGH);
  digitalWrite(motorBPin2, LOW);
  // analogWrite(motorBEnablePin, 255);
  }else if (speed <0){
  digitalWrite(motorAPin1, LOW);
  digitalWrite(motorAPin2, HIGH);
  // analogWrite(motorAEnablePin, 255);
  
    // Adjust speed by changing the PWM value
 digitalWrite(motorBPin1, LOW);
  digitalWrite(motorBPin2, HIGH);
  // analogWrite(motorBEnablePin, 255);
  }else {
digitalWrite(motorAPin1, LOW);
  digitalWrite(motorAPin2, LOW);
  // analogWrite(motorAEnablePin, 0);
  
    // Adjust speed by changing the PWM value
 digitalWrite(motorBPin1, LOW);
  digitalWrite(motorBPin2, LOW);
  // analogWrite(motorBEnablePin,0);
  
  }
   analogWrite(motorAEnablePin, abs(speed));
  analogWrite(motorBEnablePin, abs(speed));
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

// Read joystick values
  int joyXValue = analogRead(joyXPin);
  int joyYValue = analogRead(joyYPin);

  int motorSpeedX = map(joyYValue, 0, 1023, -255, 255);
  int motorSpeedY = map(joyYValue, 0, 1023, -255, 255);

   // Map joystick values to motor speed (-255 to 255)
  int motorSpeed= (motorSpeedX +motorSpeedY)/2;

// Move motor A based on joystick input
 moveMotorAForward(motorSpeed);


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
  moveMotorAForward(motorSpeed);
  }

  // Add a delay before the next measurement
  delay(100);
}
