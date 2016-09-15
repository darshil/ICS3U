// The "AssignVsInputDemo.java" class.
import javax.swing.JOptionPane;
import java.text.*;
public class DemoMathClass

{
    public static void main (String[] args)
    {

	// Declare variables

	String numberOneString, numberTwoString;  // you need one variable to input the string from the keyboard
	int numberOne, numberTwo, divide, remainder;



	// INPUT
	// The following statement prompts for input and assigns it to a string variable

	numberOneString = JOptionPane.showInputDialog ("Enter a number");
	numberTwoString = JOptionPane.showInputDialog ("Enter a second number");


	// PROCESSING

	numberOne = Integer.parseInt (numberOneString); // this line converts the string to an decimal (double) number
	numberTwo = Integer.parseInt (numberTwoString);

	divide = numberOne / numberTwo;
	remainder = numberOne % numberTwo;



	// OUTPUT
	System.out.println (numberTwo + " goes into " + numberOne);
	System.out.println (divide + " times");
	System.out.println ("with remainder " + remainder);



	// Place your code here
    } // main method
} // DemoMathClass class
