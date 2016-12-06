//**********************************************************
// Assignment: J3A3
//
// Description: J3A3 Using Math.pow() and Math.sqrt()
//
// Author: Darshil Patel
// Date Completed: Oct 17, 2016
//
// Completion time: 15 mins
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************


import java.util.*;
public class J3A3PatelDarshil
{
   public static void main (String[] args)
   {
      //User Input
      System.out.println("Enter the base of the triangle");
      Scanner input = new Scanner(System.in);
      double triangleBase = input.nextInt();
      System.out.println("Enter the height of the triangle");
      double triangleHeight = input.nextInt();
     
      //Calculations
      double calculation1 = Math.pow(triangleBase, 2) + Math.pow(triangleHeight, 2);
      double hypotenuse = Math.sqrt(calculation1);      
      //Output
      System.out.println("The hypotenuse of the triangle is " + hypotenuse);      

   } 
} 
