// #include <Stepper.h>

#include <Servo.h>

//  A connections
const int motorAPin1 = 4;  // Connect to L298N IN1
const int motorAPin2 = 5;  // Connect to L298N IN2
const int motorAEnablePin = 8;  // Connect to L298N ENAc
const int motorBPin1 = 6;  // Connect to L298N IN1
const int motorBPin2 = 7;  // Connect to L298N IN2
const int motorBEnablePin = 9;  // Connect to L298N ENA


Servo myServo;
// // Ultrasonic sensor connections
const int trigPin = 2;  // Connect to the trigger pin on the ultrasonic sensor
const int echoPin = 3;  // Connect to the echo pin on the ultrasonic sensor

 // Ultrasonic sensor connections
const int trigPin1 = 0;  // Connect to the trigger pin on the ultrasonic sensor
const int echoPin1= 1;  // Connect to the echo pin on the ultrasonic sensor

const int led = 10;
const int obstacleThreshold = 20;
const int obstacleThreshold1 = 20;

void setup() {
  // Initialize serial communication
  Serial.begin(9600);


  pinMode(motorAPin1, OUTPUT);
  pinMode(motorAPin2, OUTPUT);
  pinMode(motorAEnablePin, OUTPUT);
  pinMode(motorBPin1, OUTPUT);
  pinMode(motorBPin2, OUTPUT);
  pinMode(motorBEnablePin, OUTPUT);
  // pinMode(led, OUTPUT);
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  // pinMode(pirPin, INPUT);
 pinMode(trigPin1, OUTPUT);
  pinMode(echoPin1, INPUT);
  myServo.attach(10);
  
 analogWrite(motorAEnablePin,150);
  analogWrite(motorBEnablePin,150);
}

void moveMotorAForward( ) {
  digitalWrite(motorAPin1, HIGH);
  digitalWrite(motorAPin2, LOW);
  digitalWrite(motorBPin1, HIGH);
  digitalWrite(motorBPin2, LOW);
}

void move_backward(){
  digitalWrite(motorAPin1, LOW);
  digitalWrite(motorAPin2, HIGH);
  digitalWrite(motorBPin1, LOW);
  digitalWrite(motorBPin2, HIGH);
  
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


  // // Trigger the ultrasonic sensor
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  long duration = pulseIn(echoPin, HIGH);
  
  // Calculate the distance in centimeters
  int distance = duration / 58;
  // int distance1 = duration1 / 58;

// moveMotorAForward();

 if (distance < obstacleThreshold) {
       stopMotorA();
       delay(500);
       myServo.write(0);
        delay(500);
        myServo.write(180);

        // digitalWrite(led, HIGH);

  }
   else{
   moveMotorAForward();
 }
  }


