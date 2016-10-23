
public class J2A8 {
	
	//**********************************************************
	// Assignment:	J2A8
	//
	// Description: Sales receipt program.
	//
	// Author: Darshil Patel
	//
	// Date Start: Sept 27, 2016
	// Date Completed: (Enter date completed)
	//
	// Completion time: 15 mins
	//
	// Honor Code: I pledge that this program represents my own
	//   program code. I received help from (enter the names of
	//   others that helped with the assignment; write no one if
	//   you received no help) in designing and debugging my program.
	//*********************************************************

	/*

	*/  


	  public static void main (String[] args)  // end of line comment
	  {
		  String customerName = "Darshil Patel"; //set's the value of the Username
		  String productName = "MacBook Pro 13"; // Set's the value for the product name
		  double productPrice = 1500.00; //assigns the product Price
		  final double taxRate = 0.13; // assigns a constant tax rate
		  double addedTax; //initializes variable which is later used 
		  double finalPrice; //initializes variable which is later used 
		  
		  addedTax = productPrice * taxRate; //calculates the tax
		  finalPrice = addedTax + productPrice; //final price incl taxes
		
		  System.out.println(customerName);
		  System.out.println( productName);
		  System.out.println("");
		  System.out.println("Price: $" + productPrice) ;
		  System.out.println("Tax: $" + addedTax);
		  System.out.println("-------");
		  System.out.println("Total: $" + finalPrice);
		 


	  } // end main method
	} // end class



