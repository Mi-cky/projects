#include <Stepper.h>
#include <Servo.h>

// Define the number of steps per revolution for the stepper motor
const int stepsPerRevolution = 10;
// Initialize the stepper motor object
Stepper myStepper(stepsPerRevolution, 8, 9, 10, 11);
const  int motorenable=4;
const int motorenableb=5;

const int motorAPin1 = 8;  // Connect to L298N IN1
const int motorAPin2 = 9;  // Connect to L298N IN2
const int motorBPin1 = 10;  // Connect to L298N IN1
const int motorBPin2 = 11;  // Connect to L298N IN2

// Initialize the servo motor object
Servo myServo;

void setup() {
  // Set up the stepper motor
  myStepper.setSpeed(60); // RPM

  // Set up the servo motor
  myServo.attach(6);

  analogWrite(motorenable,50);
  analogWrite(motorenableb,50);

}


void moveMotorAForward( ) {
  digitalWrite(motorAPin1, HIGH);
  digitalWrite(motorAPin2, LOW);
  digitalWrite(motorBPin1, HIGH);
  digitalWrite(motorBPin2, LOW);
}


void moveMotorAbackward( ) {
  digitalWrite(motorAPin1, LOW);
  digitalWrite(motorAPin2, HIGH);
  digitalWrite(motorBPin1, LOW);
  digitalWrite(motorBPin2, HIGH);
}


void loop() {
  moveMotorAForward(); 
  delay(500);

  // Rotate the stepper motor 360 degrees clockwise
  // for (int i = 0; i < stepsPerRevolution; i++) {
    // myStepper.step(1);
    // delay(500); // Adjust as needed for smooth motion
  // }
  // delay(1000); // Wait for 1 second
  
  // Move the servo motor to 0 degrees
  myServo.write(0);
  delay(1000); // Wait for 1 second
  
  // Move the servo motor to 180 degrees
  
  moveMotorAbackward( );
delay(500);
  myServo.write(180);
  delay(1000); // Wait for 1 second
}


