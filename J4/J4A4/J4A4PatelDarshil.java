//**********************************************************
// Assignment:J4A4 Basic if...else Statement 
// Description: print the square root of the number or the message: 
//              "Negative numbers do not have a square root value".
// Author: Darshil Patel
//
// Date Completed: OCT 25, 2016
//
// Completion time: 10 mins 
//
// Honour Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************
import java.util.*;
public class J4A4PatelDarshil
{
   public static void main (String[] args)
   {
      
      System.out.println("Enter a number");
      Scanner input = new Scanner(System.in);
      double userInput = input.nextDouble();
      
      
      if(userInput > 0){
      double userOutput = Math.sqrt(userInput);
      System.out.println("The square root of " + userInput + " is " + userOutput);
      }else {
      System.out.println("Negative numbers do not have a square root");
      }
      
      System.out.println("The End.");

    } 
}
