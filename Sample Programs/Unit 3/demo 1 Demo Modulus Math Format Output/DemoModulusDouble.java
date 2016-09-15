/*
 Demonstration of Modulus % with doubles
 - try dividing 5 by 0.1 and examine the remainder
 - this is a demonstration of the conversion error when converting
   decimal fractions to fractions in base 2
*/

import java.util.*;
public class DemoModulusDouble
{
    public static void main (String[] args)
    {

    // Step 1 - Declaring variables
    double dblDividend;
    double dblDivisor;
    double dblQuotient;
    double dblRemainder;

    Scanner stdin = new Scanner(System.in);
    
    // Step 2 - (Input) Assigning values to variables
    System.out.println("Enter dividend");
    dblDividend = stdin.nextDouble();
    
    System.out.println("Enter divisor: ");  
    dblDivisor =  stdin.nextDouble();
    
    //Step 3 - Processing
    dblQuotient = dblDividend/dblDivisor;
    dblRemainder = dblDividend%dblDivisor;
    
    // Step 4 - Output
    System.out.println (dblDividend + " / " + dblDivisor + " = " + dblQuotient);
    System.out.println (" with remainder " + dblRemainder);
    
    } // end main method
} // end DemoModulus class
