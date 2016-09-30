// Using the Scanner class for Input
import java.util.*;
public class P1
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables


    double numberA;
    double numberB;
    Scanner stdin = new Scanner(System.in);
    
    // Step 2 - (Input) Assigning values to variables

    
    System.out.println("Enter the 1st number ");  // prompt the user for input
    numberA = Double.parseDouble (stdin.nextLine());
    
    System.out.println("Enter the 2nd number ");  // prompt the user for input
    numberB = Double.parseDouble (stdin.nextLine());
    

    //Step 3 - Processing
     // prints out the calculations
    System.out.println("The sum of the two numbers is  " + (numberA + numberB) );
    System.out.println("The difference of the two numbers is  " + (numberA - numberB) );
    System.out.println("The product of the two numbers is  " + (numberA * numberB) );
    System.out.println("The modulous of the two numbers is  " + (numberA % numberB) );
    
    
    

  } // end main method
} // end class
