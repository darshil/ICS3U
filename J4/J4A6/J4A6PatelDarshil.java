//**********************************************************
// Assignment:	J4A6 if Statement with Strings 
// Description: If the student's favourite is pizza, respond 
//              with "I like pizza too!", but if they do not 
//              enter pizza, respond with "I hate ______!"
//
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
public class J4A6PatelDarshil
{
   public static void main (String[] args)
   {
      
      System.out.println("Enter your favourite food");
      Scanner input = new Scanner(System.in);
      String userInput = input.nextLine();
      
      
      if(userInput.equalsIgnoreCase("Pizza")){
      System.out.println("I like pizza too!");
      }else {
      System.out.println("I hate " + userInput + "!");
      }
      
    } 
}
