//**********************************************************
// Assignment: J3A4
//
// Description: Write a program that inputs the radius of a circle and then calculates the
// circumference and the area of the circle. The radius can be a decimal number.
// Use Math.PI for your value of Pi and use a Math method in your calculation of the
// area.
//
// Author: Darshil Patel
// Date Completed: Oct 17, 2016
//
// Completion time: 15 mins
//
// Honor Code: I pledge that this program represents my own
// program code. I received help from no one in designing and debugging my program.
//*********************************************************
import java.util.*;
public class J3A4PatelDarshil
{
 public static void main (String[] args)
 {
 //User Input
 Scanner input = new Scanner(System.in);
 System.out.println("Enter the radius of a circle");
 double circleRad = input.nextDouble();

 //Calculations
 double circumference = 2 * (Math.PI) * circleRad;
 int area = Math.PI* circleRad;
 double areaFinal = Math.sqrt(area,2);

 //Output
 System.out.println("The hypotenuse of the triangle is " + circumference);
 }
}