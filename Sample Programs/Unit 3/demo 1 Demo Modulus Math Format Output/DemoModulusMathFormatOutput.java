// The "AssignVsInputDemo.java" class.

import javax.swing.JOptionPane;
import java.text.*;
public class DemoModulusMathFormatOutput

{
    public static void main (String[] args)
    {
	
	// Declare variables

	String changeString;  // you need one variable to input the string from the keyboard
	double change, toonies, balance;
	DecimalFormat df1 = new DecimalFormat("###0.00");  // this tells Java how you want to display a number


	// INPUT
	// The following statement prompts for input and assigns it to a string variable

	changeString = JOptionPane.showInputDialog ("Enter your change");

	
	
	// PROCESSING

	change = Double.parseDouble (changeString); // this line converts the string to an decimal (double) number
	toonies = Math.floor(change/2);  // use Math.floor to eliminate the fractions.
	balance = change % 2;  
	
		
	// OUTPUT
	System.out.println ("the change is " + change);
	System.out.println (" # of toonies " + toonies);
	System.out.println (balance + " balance is " + df1.format(balance)); // this line uses the format above to display the result
	
	
	// Place your code here
    } // main method
} // DemoModulusMathFormatOutput class
