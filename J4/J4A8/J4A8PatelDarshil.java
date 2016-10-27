//**********************************************************
// Assignment:	J4A8 Compound if Statement 
// Description:  Write a program that asks the user for their name, sex (Male or Female)
// and weight (in kg). Print the name and their weight if the person is male and weighs 
// at least 85 kg, and invite them to join the wrestling team. Print the name and their 
// weight if the person is female and weighs less than 50 kg, and invite them to join the  
// gymnastics team. Print the name of any other student and invite them to join the debating team. 
//
//
// Author: Darshil Patel
//
// Date Started: Oct 26, 2016
// Date Completed: Oct 27, 2016
//
// Completion time: 10 mins 
//
// Honour Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************
import java.util.*;
public class J4A8PatelDarshil
{
   public static void main (String[] args)
   {
      
      Scanner input = new Scanner(System.in); 
      System.out.println("Enter your Name"); 
      String userName = input.nextLine();
      System.out.println("Are you a male or a female?");
      String userInfo = input.nextLine();
      System.out.println("Enter your weight in kg");
       int userWeight = input.nextInt();
       
       if(userInfo.equalsIgnoreCase("Male") && userWeight >=85   ){
         System.out.println(userName + " you are " + userWeight + "Kg. Please join the wrestling team!");
       
       }
       
       else if(userInfo.equalsIgnoreCase("Female") && userWeight < 50 ){
        System.out.println(userName + " you are " + userWeight + "Kg. Please join the gymnastics team!");
       } 
       else {
        System.out.println(userName + " you are " + userWeight + "Kg. Please join the debating team!");

       }

    } 
}