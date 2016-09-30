// Using the Scanner class for Input
import java.util.*;
public class P3
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables


    double kmInput;
    Scanner stdin = new Scanner(System.in);
    
    // Step 2 - (Input) Assigning values to variables

    
    System.out.println("Enter the km   ");  // prompt the user for input
   kmInput = Double.parseDouble (stdin.nextLine());
    

    //Step 3 - Processing
     // prints out the calculations
    System.out.println("The miles converted from km is  " + (kmInput *  0.62137));
    
    
    

  } // end main method
} // end class
