#include <Stepper.h>
#include <Servo.h>

// Ultrasonic sensor pins
const int trigPin = 2;
const int echoPin = 3;

// Servo motor pin
const int servoPin = 6;

// Stepper motor pins
const int motor1Pin1 = 3;
const int motor1Pin2 = 2;
const int motor2Pin1 = 7;
const int motor2Pin2 = 8;

// Define servo and stepper objects
Servo myServo;
Stepper myStepper(200, motor1Pin1, motor1Pin2, motor2Pin1, motor2Pin2);

// Define enable pin for L298N motor driver
const int enablePin = 10;
const int enablePinb = 11;


void setup() {
  // Initialize serial communication
  Serial.begin(9600);

  // Set up ultrasonic sensor pins
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);

  // Set up servo motor
  myServo.attach(servoPin);

  // Set up motor driver enable pin
  pinMode(enablePin, OUTPUT);
  digitalWrite(enablePin, HIGH); // Enable the motor driver

  pinMode(enablePinb, OUTPUT);
  digitalWrite(enablePinb, HIGH); // Enable the motor driver

}

void loop() {
  // Check for obstacles
  if (checkObstacle()) {
    // If obstacle detected, scan for clear path
    int obstacleDirection = scanForClearPath();
    
    // Move accordingly based on the result of scanning
    if (obstacleDirection == 1) {
      moveRight();
    } else if (obstacleDirection == -1) {
      moveLeft();
    }
  } else {
    // If no obstacle, move forward
    moveForward();
  }
}

bool checkObstacle() {
  // Trigger the ultrasonic sensor
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);

  // Measure the pulse from echo pin
  long duration = pulseIn(echoPin, HIGH);

  // Convert the duration to distance
  float distance = duration * 0.034 / 2;

  // Check if there is an obstacle within a certain distance threshold
  if (distance < 20) {
    return true; // Obstacle detected
  } else {
    return false; // No obstacle
  }
}

int scanForClearPath() {
  // Scan from -90 to 90 degrees with the servo motor
  for (int angle = -90; angle <= 90; angle += 10) {
    myServo.write(angle);
    delay(500); // Wait for the servo to reach its position
    
    // Check for obstacles in the current direction
    if (!checkObstacle()) {
      return angle < 0 ? -1 : 1; // Return -1 for left, 1 for right
    }
  }
  
  // If no clear path found, return 0
  return 0;
}

void moveForward() {
  // Rotate the stepper motor forward
  myStepper.step(200); // Adjust steps as needed
}

void moveRight() {
  // Rotate the stepper motor to turn right
  myStepper.step(-100); // Adjust steps as needed
}

void moveLeft() {
  // Rotate the stepper motor to turn left
  myStepper.step(100); // Adjust steps as needed
}
