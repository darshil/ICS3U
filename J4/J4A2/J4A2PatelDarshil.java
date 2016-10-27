//**********************************************************
// Assignment:J4A2 Basic if Statement 
// Description: A program that inputs an integer number from the user that must be greater than 10.
//
// Author: Darshil Patel
//
// Date Started: Oct 24, 2016
// Date Completed: Oct 24, 2016
// 
// Completion time: 10 mins 
//
// Honour Code: I pledge that this program represents my own
// program code. I received help from no one in designing and debugging my program.
//*********************************************************
import java.util.*;
public class J4A2PatelDarshil
{
   public static void main (String[] args)
   {
      
      System.out.println("Enter a number greater than 10");
      Scanner input = new Scanner(System.in);
      int userInput = input.nextInt();
      
      if(userInput <10 ){
      System.out.println("Your number was not greater than 10!");
      } 
      
      System.out.println("The end."); 
    } 
}
