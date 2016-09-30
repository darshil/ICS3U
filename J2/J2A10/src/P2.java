// Using the Scanner class for Input
import java.util.*;
public class P2
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables


    double radiusInput;
    Scanner stdin = new Scanner(System.in);
    
    // Step 2 - (Input) Assigning values to variables

    
    System.out.println("Enter the radius ");  // prompt the user for input
    radiusInput = Double.parseDouble (stdin.nextLine());
    

    //Step 3 - Processing
     // prints out the calculations
    System.out.println("The area of the circle is  " + (Math.PI * Math.pow(radiusInput ,2)) );
    System.out.println("The circumference of the circle is  " + (2 * Math.PI * radiusInput ) );
    
    
    

  } // end main method
} // end class
