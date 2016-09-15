//  Program Header Block
//  title of program
//  your name
//  date you created the program (programmers also document the revision dates here too
//  brief description of what the program does

import java.util.*;
public class Demo6SInput
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables
    String strNumberA, strName;
    double dblNumberA;
    Scanner stdin = new Scanner(System.in);
    
    // Step 2 - (Input) Assigning values to variables
    System.out.println("Enter your name");
    strName = stdin.nextLine();
    
    System.out.println("Enter number A: ");  
    //dblNumberA =  stdin.nextDouble();
    strNumberA =  stdin.nextLine();
    
    //Step 3 - Processing
    dblNumberA = Double.parseDouble (strNumberA); // turns the string into a double number
    
    // Step 4 - Output
    System.out.println("Your name is " + strName);
    System.out.println("strNumberA is " + strNumberA +"\nbut think of it as \""+strNumberA+"\""); // the string looks like a number but is not
    System.out.println("dblNumberA is " + dblNumberA+"\nand you can do math with this "+dblNumberA); // the integer number is a number you can do math with
    System.out.println("for example, 2 times dblNumberA is " + (2 * dblNumberA));
    
    // Place your code here
  } // main method
} // Demo1 class
