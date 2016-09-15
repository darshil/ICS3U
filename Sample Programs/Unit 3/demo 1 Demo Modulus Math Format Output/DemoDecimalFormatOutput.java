/*
 The "DemoDecimalFormatOutput" class.
 Demonstration of decimal formatting options for output.
 */

import java.text.*;
public class DemoDecimalFormatOutput

{
    public static void main (String[] args)
    {
	
	// Declare variables

	double number = 9.87654321;
   DecimalFormat df1 = new DecimalFormat("###0.0000");  // this tells Java how you want to display a number


	// INPUT
	
	// PROCESSING
		
	// OUTPUT
	System.out.println (number + " formated becomes " + df1.format(number)); // this line uses the format above to display the result
	System.out.printf(number + " formated becomes %.4f", number);
   System.out.println();
	System.out.format(number + " formated becomes %.4f", number);
   System.out.println();
	
	// Place your code here
    } // main method
} // DemoDecimalFormatOutput class
