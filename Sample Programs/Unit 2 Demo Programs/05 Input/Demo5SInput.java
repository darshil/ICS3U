//  Program Header Block
//  title of program
//  your name
//  date you created the program (programmers also document the revision dates here too
//  brief description of what the program does

import java.util.*;
public class Demo5SInput
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables
    String strNumberA, strName;
    int intNumberA;
    Scanner stdin = new Scanner(System.in);
    
    // Step 2 - (Input) Assigning values to variables
    System.out.println("Enter your name");
    strName = stdin.nextLine();
    
    System.out.println("Enter number A: ");  
    //intNumberA =  stdin.nextInt();
    strNumberA =  stdin.nextLine();
    
    //Step 3 - Processing
    intNumberA = Integer.parseInt (strNumberA); // turns the string into an integer number
    
    // Step 4 - Output
    System.out.println ("Your name is " + strName);
    System.out.println ("strNumberA is " + strNumberA +"\nbut think of it as \""+strNumberA+"\""); // the string looks like a number but is not
    System.out.println ("intNumberA is " + intNumberA+"\nand you can do math with this "+intNumberA); // the integer number is a number you can do math with
    System.out.println ("for example, 2 times intNumberA is " + (2 * intNumberA));
    
    // Place your code here
  } // main method
} // Demo1 class
