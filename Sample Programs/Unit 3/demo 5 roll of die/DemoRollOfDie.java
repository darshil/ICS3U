// The "AssignVsInputDemo.java" class.
import javax.swing.JOptionPane;
import java.text.*;
public class DemoRollOfDie
//
// This demo shows how to use 'casting' to cast a double into an integer value
//
{
    public static void main (String[] args)
    {

	// Declare variables
	double randomNumber, scaleRandomNumber;
	int rollOfDie;
	 int intNO_OF_SIDES = 6;


	// INPUT


	// PROCESSING

	randomNumber = Math.random ();
	intNO_OF_SIDES = 8;
	scaleRandomNumber = intNO_OF_SIDES * randomNumber;
	rollOfDie = (int) scaleRandomNumber +1;



	// OUTPUT
	System.out.println ("the random number is " + randomNumber);
	System.out.println ("the scaled ( x 6 ) random number is " + scaleRandomNumber);
	System.out.println ("the roll of die is " + rollOfDie);
	System.out.println ();
	System.out.println (" (int) 1.9999999 = " + ((int)1.9999999));
	System.out.println (" (int) 3.5 = " + ((int)3.5));
	System.out.println (" (int) 6.0000000001 = " + ((int)6.0000000001));


	// Place your code here
    } // main method
} // DemoRollOfDie class
