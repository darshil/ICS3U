//**********************************************************
// Assignment:J4A5 Basic if...else if...else Statement 
// Description:  a program that will find the discriminate of the quadratic equation Ax2 + Bx + C = 0 
//
// Author: Darshil Patel
//
// Date Started: Oct 25, 2016
// Date Completed: OCT 25, 2016
//
// Completion time: 10 mins 
//
// Honour Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************
import java.util.*;
public class J4A5PatelDarshil
{
   public static void main (String[] args)
   {
      double userCalculation;
      
      System.out.println("Enter the A Value");
      Scanner input = new Scanner(System.in);
      double a = input.nextDouble();
      System.out.println("Enter the B Value");
      double b = input.nextDouble();
      System.out.println("Enter the C Value");
      double c = input.nextDouble();
      
      userCalculation = Math.pow(b, 2) - 4 * (a * c) ;
      
      if(userCalculation == 0){
      System.out.println("There is only one root");
      }
      else if(userCalculation > 0){
      System.out.println("There are two roots");
      }
      else if(userCalculation < 0){
      System.out.println("There are no real roots");
      }
     
    } 
}
