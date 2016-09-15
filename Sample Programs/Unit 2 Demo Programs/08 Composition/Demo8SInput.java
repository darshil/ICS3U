//  Program Header Block
//  title of program
//  your name
//  date you created the program (programmers also document the revision dates here too
//  brief description of what the program does

import java.util.*;
public class Demo8SInput
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables  
    String strName;
    int intNumberA;
    Scanner stdin = new Scanner(System.in);
        
    // Step 2 - (Input) Assigning values to variables
    System.out.println("Enter your name");
    strName = stdin.nextLine();

    // The OUPUT of one method can be used as the INPUT to another method...
    System.out.println("Enter your number");
    intNumberA = Integer.parseInt (stdin.nextLine()); 
    // No need to assign the String to a variable...the String representing the
    // number can be fed directly to the parseInt() method.
  
    // Step 3 - Processing
    
    // Step 4 - Output
    System.out.println ("Your name is " + strName);
    System.out.println ("intNumberA is " + intNumberA+"\nand you can do math with this "+intNumberA); // the integer number is a number you can do math with
    System.out.println ("for example, 2 times intNumberA is " + (2 * intNumberA));
    
    // Place your code here
  } // main method
} // Demo1 class
