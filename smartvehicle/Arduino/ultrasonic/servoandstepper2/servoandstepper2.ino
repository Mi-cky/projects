#include <Stepper.h>
#include <Servo.h>

// Define the number of steps per revolution for the stepper motor
const int stepsPerRevolution = 200;
// Initialize the stepper motor object
Stepper myStepper(stepsPerRevolution, 2, 3, 4, 5);
// Initialize the servo motor object
Servo myServo;
const  int motorenable=8;
const int motorenableb=9;

void setup() {
  // Set up the stepper motor
  myStepper.setSpeed(2); // RPM;

  // Set up the servo motor
  myServo.attach(6);
  
  pinMode(motorenable,OUTPUT);

  pinMode(motorenable,OUTPUT);
  digitalWrite(motorenableb,HIGH);
  digitalWrite(motorenable,HIGH);
 
}

void loop() {
  

  // Rotate the stepper motor 360 degrees clockwise
  // for (int i = 0; i < stepsPerRevolution; i++) {
    myStepper.step(1);
    delay(500); // Adjust as needed for smooth motion
   
  // }
  
  
  myServo.write(0);
  delay(500);
   
  
//  for (int i = 0; i < stepsPerRevolution; i++) {
    // myStepper.step(-1);
    // delay(150); // Adjust as needed for smooth motion
   
//   // delay(1000);
//   }
  myServo.write(90);
  delay(500);
  
 myServo.write(180);
  delay(500);
}
