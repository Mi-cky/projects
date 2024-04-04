// #include <Servo.h>

// Motor connections
const int motorPin1 = 2;  // Connect to L298N IN1
const int motorPin2 = 3;  // Connect to L298N IN2
const int motorEnablePinA = 9;  // Connect to L298N ENA
const int motorpin3 = 6;//CONNECT TO L298N IN3 
const int motorpin4= 7;//CONNNECT TO L298N IN4
const int motorEnablePinB = 8; //CONNECT TO L298N ENB 
// const int servoPin = 10;
const int led = 12;

// Ultrasonic sensor connections
const int trigPin = 10;  // Connect to the trigger pin on the ultrasonic sensor
const int echoPin = 11;  // Connect to the echo pin on the ultrasonic sensor

// Servo myServo;

// Define the threshold distance for obstacle detection in centimeters
const int obstacleThreshold = 20;

void setup() {
  // digitalWrite(led, HIGH);
  // Initialize serial communication
  // Serial.begin(9600);

  // Set motor control pins as outputs
  pinMode(motorPin1, OUTPUT);
  pinMode(motorPin2, OUTPUT);
  pinMode(motorEnablePinA,OUTPUT);
  pinMode(motorpin3,OUTPUT);
  pinMode(motorpin4,OUTPUT);
  pinMode(motorEnablePinB,OUTPUT);
  pinMode(led, OUTPUT);
  // myServo.attach(10);


  // Set ultrasonic sensor trigger and echo pins as OUTPUT and INPUT, respectively
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);

}
// void movethemotor(){

// // if ()

// }

void moveForward() {
  // Move the motor forward
  digitalWrite(motorPin1, HIGH);
  digitalWrite(motorPin2, LOW);
  // Adjust speed by changing the PWM value

  digitalWrite(motorpin3,HIGH);
  digitalWrite(motorpin4,LOW);

  analogWrite(motorEnablePinA, 150); 
  analogWrite(motorEnablePinB,150);
}

void moveBackward() {
  // Move the motor forward
  digitalWrite(motorPin1, LOW);
  digitalWrite(motorPin2, HIGH);
  // Adjust speed by changing the PWM value

  digitalWrite(motorpin3,LOW);
  digitalWrite(motorpin4,HIGH);

  analogWrite(motorEnablePinA, 150); 
  analogWrite(motorEnablePinB,150);
}


void stopMotor() {
  // Stop the motor
  digitalWrite(motorPin1, LOW);
  digitalWrite(motorPin2, LOW);
  analogWrite(motorEnablePinA,0);
  
  digitalWrite(motorpin3,LOW);
  digitalWrite(motorpin4,LOW);
  analogWrite(motorEnablePinB,0);
}

// void servomovement(){
  
//   // Move the servo to the 90-degree position
//   myServo.write(180);

    

// }
void check_obstacle(){

  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);

  // Measure the time it takes for the ultrasonic pulse to return
  long duration = pulseIn(echoPin, HIGH);

  // Calculate the distance in centimeters
  int distance = duration / 58;
  return distance;

if (distance < obstacleThreshold) {
  digitalWrite(led, HIGH);
   moveBackward();
}
else{
  moveForward();
  digitalWrite(led, LOW);
}
}
// void vehicledirection(){
//     // Serial.println("Obstacle detected! Stopping motor.");
//     stopMotor();
//     servomovement();


//   } else {
//     // If no obstacle, move the motor forward
//     movethemotor ();
//   }


 
void loop() {
  // moveBackward();

 check_obstacle();
//  vehicle_direction();

  // delay(500);
}
