/*
 Demonstration of Modulus % using integers
 */

import java.util.*;
public class DemoModulusInt
{
    public static void main (String[] args)
    {

       // Step 1 - Declaring variables
       int intDividend;
       int intDivisor;
       int intQuotient;
       int intRemainder;
   
       Scanner stdin = new Scanner(System.in);
       
       // Step 2 - (Input) Assigning values to variables
       System.out.println("Enter dividend");
       intDividend = stdin.nextInt();
       
       System.out.println("Enter divisor: ");  
       intDivisor =  stdin.nextInt();
       
       //Step 3 - Processing
       intQuotient = intDividend/intDivisor;
       intRemainder = intDividend%intDivisor;
   
       // Step 4 - Output
       System.out.println (intDividend + " / " + intDivisor + " = " + intQuotient);
       System.out.println (" with remainder " + intRemainder);
    
    } // end main method
} // end DemoModulus class