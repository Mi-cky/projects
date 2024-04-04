#include <Stepper.h>
#include <Servo.h>

// Define the number of steps per revolution for the stepper motor
const int stepsPerRevolution = 10;
// Initialize the stepper motor object
Stepper myStepper(stepsPerRevolution, 8, 9, 10, 11);
const  int motorenable=4;
const int motorenableb=5;
// Initialize the servo motor object
Servo myServo;

void setup() {
  // Set up the stepper motor
  myStepper.setSpeed(60); // RPM

  // Set up the servo motor
  myServo.attach(6);

  digitalWrite(motorenable,HIGH);
  digitalWrite(motorenableb,HIGH);

}

void loop() {
  // Rotate the stepper motor 360 degrees clockwise
  // for (int i = 0; i < stepsPerRevolution; i++) {
    myStepper.step(1);
    delay(500); // Adjust as needed for smooth motion
  // }
  // delay(1000); // Wait for 1 second
  
  // Move the servo motor to 0 degrees
  myServo.write(0);
  delay(1000); // Wait for 1 second
  
  // Move the servo motor to 180 degrees
  myServo.write(180);
  delay(1000); // Wait for 1 second
}
