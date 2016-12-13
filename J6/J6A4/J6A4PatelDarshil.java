//**********************************************************
// Assignment: J6A4 Using String Methods
//
// Description: lets you enter a word and that prints out the
//              number of vowels and the number of consonants
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
public class J6A4PatelDarshil
{
   public static void main (String[] args)
   {
  
   // variable init
    String userInput;
    boolean programState = false;
    String endProgram = "Stop";
    int vowelCounter = 0;
    int constantCounter = 0;
    
    // runs until "stop" is inputted
    while(!programState){
      System.out.println("Enter a word");
      Scanner input = new Scanner(System.in);
      userInput = input.nextLine().toString();
      
      // Checks for stop, to end program
      boolean endCheck = endProgram.equalsIgnoreCase(userInput);
      
      //ends program if input is "end"
      if(endCheck){
      System.out.println("Hello");
      programState = true;
      }
      else{
      
      //checks each character if it is a vowel
      for(int i=0;i <userInput.length();i++){
            if((userInput.charAt(i) == 'a') || 
                (userInput.charAt(i) == 'e')  ||
                (userInput.charAt(i) == 'i') || 
                (userInput.charAt(i) == 'o') ||
                (userInput.charAt(i) == 'u')) 
                {
                vowelCounter++;
                }
        }
     // takes number of vowels and substracts it from the total string length to get Constants
      constantCounter = userInput.length() - vowelCounter;
      System.out.println(vowelCounter + "Vowels and "  + constantCounter + "Constants"); 
      vowelCounter = 0;
      }
      
    }
    

    
   } 
} 
