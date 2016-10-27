//**********************************************************
// Assignment:J4A3 Basic if...else Statement 
// Description: Your program will check the mark and print appropriately: "PASS" or "FAIL".
//
// Author: Darshil Patel
// 
// Date Started: 0ct 24, 2016
// Date Completed: Oct 24, 2016
//
// Completion time: 15 mins 
//
// Honour Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************
import java.util.*;
public class J4A3PatelDarshil
{
   public static void main (String[] args)
   {
      
      System.out.println("Enter a mark");
      Scanner input = new Scanner(System.in);
      int userInput = input.nextInt();
      
      if(userInput <50 ){
      System.out.println("FAIL");
      } 
      else if (userInput >= 50 ){
      System.out.println("PASS");
      }
      
      System.out.println("The end."); 
    } 
}
