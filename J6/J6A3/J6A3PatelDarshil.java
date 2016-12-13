//**********************************************************
// Assignment: J6A3 Using String Methods
//
// Description: asks for the user's name and then writes it back with 
//              the first name all in lower case letters, and the last 
//              name all in upper case letters. The name should also be 
//              reversed (last name first and first name last). 
//
// Author: Darshil Patel
//
// Date Start: Dec 13, 2016
// Date Completed: Dec 13, 2016
//
// Completion time: 20 mins
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing 
//   and debugging my program.
//*********************************************************


import java.util.*;
public class J6A3PatelDarshil
{
   public static void main (String[] args)
   {
     int firstSpace;
     String userInput;
     String firstName;
     String lastName;
     int nameLength;
      
      System.out.println("Enter your name");
      Scanner input = new Scanner(System.in);
      userInput = input.nextLine().toString();
      
      firstSpace = userInput.indexOf(' ');
      nameLength = userInput.length();
      
       firstName = userInput.substring(0,firstSpace);
       firstName = firstName.toLowerDCase();
       
       lastName = userInput.substring(firstSpace, nameLength);
       lastName = lastName.toUpperCase();
      
      System.out.println(lastName.trim() + " " + firstName);
      
   
   } 
} 
