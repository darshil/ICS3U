//**********************************************************
// Assignment:	J4A7 more if Statement with Strings 
// Description: a program that will ask for a student s name 
// and the name of their high school.
//
// Author: Darshil Patel
//
// Date Completed: Oct 26, 2016
//
// Completion time: 10 mins 
//
// Honour Code: I pledge that this program represents my own
//   program code. I received help from no one in designing and debugging my program.
//*********************************************************
import java.util.*;
public class J4A7PatelDarshil
{
   public static void main (String[] args)
   {
      
     Scanner input = new Scanner(System.in); 
      System.out.println("Enter your Name"); 
      String userName = input.nextLine();
      System.out.println("Enter your Highschool");
      String userSchool = input.nextLine();
 
      if(userSchool.equalsIgnoreCase("Chinguacousy")){
      System.out.println(userName + "! " + "You should be in class!");
      }else {
      System.out.println("Welcome to Chinguacousy " + userName + " !");
      
      }
      
    } 
}
