/*
 Demonstration of Modulus %
 - done 2 ways...using integers and doubles
 - try doubles and divide 5 by 0.1 and examine the remainder
 - this is a demonstration of the conversion error when converting
   decimal fractions to fractions in base 2
*/

import java.util.*;
public class DemoModulus
{
    public static void main (String[] args)
    {

    // Step 1 - Declaring variables
   /* int intDividend;
    int intDivisor;
    int intQuotient;
    int intRemainder;
    */
    double dblDividend;
    double dblDivisor;
    double dblQuotient;
    double dblRemainder;
    //*/
    Scanner stdin = new Scanner(System.in);
    
    // Step 2 - (Input) Assigning values to variables
    System.out.println("Enter dividend");
    //intDividend = stdin.nextInt();
    dblDividend = stdin.nextDouble();
    
    System.out.println("Enter divisor: ");  
    //intDivisor =  stdin.nextInt();
    dblDivisor =  stdin.nextDouble();
    
    //Step 3 - Processing
    /*intQuotient = intDividend/intDivisor;
    intRemainder = intDividend%intDivisor;
    */
    dblQuotient = dblDividend/dblDivisor;
    dblRemainder = dblDividend%dblDivisor;
    //*/
    
    // Step 4 - Output
   /* System.out.println (intDividend + " / " + intDivisor + " = " + intQuotient);
    System.out.println (" with remainder " + intRemainder);
    */
    System.out.println (dblDividend + " / " + dblDivisor + " = " + dblQuotient);
    System.out.println (" with remainder " + dblRemainder);
   // */
    } // end main method
} // end DemoModulus class
