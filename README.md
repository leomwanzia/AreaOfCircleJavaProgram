![image](https://github.com/user-attachments/assets/8438daa5-3654-4b5d-998b-4e4afa7ee5cd)![image](https://github.com/user-attachments/assets/16f55756-0348-4d73-8380-335a27fabb75)# AreaOfCircleJavaProgram

## Description
This Java program calculates the area of a circle given its radius. The program uses the formula:

\[ \text{Area} = \pi \times \text{radius}^2 \]

where \(\pi\) is approximately 3.14159.

## How to Use
1. **Clone the Repository**:
   ```sh
   git clone <repository-url>
   cd AreaOfCircleJavaProgram
Compile the Java Program:

sh
##javac AreaOfCircle.java
Run the Program:

Explanation
Import Statement:

java

**import java.util.Scanner;**

This line imports the Scanner class from the java.util package. The Scanner class is used to read input from the user.

Class Declaration:

java

**public class AreaOfCircle {**

This line declares a public class named AreaOfCircle. In Java, every program must have at least one class.

Main Method:

java

**public static void main(String[] args) {**

This is the entry point of the Java program. The main method is where the execution of the program begins.

Creating a Scanner Object:

java

**Scanner scanner = new Scanner(System.in);**

This line creates a Scanner object named scanner that reads input from the standard input (usually the keyboard).

Prompting the User for Input:

java

**System.out.print("Enter the radius of the circle: ");**

This line prints a prompt to the console asking the user to enter the radius of the circle.

Reading the User Input:

java

**double radius = scanner.nextDouble();**

This line reads a double value from the user and stores it in the variable radius. The nextDouble() method of the Scanner class is used to read a floating-point number.

Calculating the Area of the Circle:

java

**double area = Math.PI * radius * radius;
**
This line calculates the area of the circle using the formula 
Area
=
π
×
radius
2
Area=π×radius 
2
 **. The Math.PI constant represents the value of π (pi).**

Printing the Result:

java

**System.out.println("The area of the circle is: " + area);**

This line prints the calculated area of the circle to the console. The println method prints the string followed by a newline.

##Summary
Import Statement: Imports the Scanner class for user input.

Class Declaration: Defines a public class named AreaOfCircle.

Main Method: The entry point of the program.

Scanner Object: Reads input from the user.

Prompt and Input: Prompts the user for the radius and reads the input.

Calculation: Calculates the area of the circle.

Output: Prints the calculated area.



##Contributing
If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

##License
This project is licensed under the MIT License.
