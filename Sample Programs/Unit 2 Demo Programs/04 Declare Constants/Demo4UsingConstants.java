//  Program Header Block
//  title of program
//  your name
//  date you created the program (programmers also document the revision dates here too
//  brief description of what the program does

public class Demo4UsingConstants
   {
   public static void main (String[] args)  // end of line comment
      {
   
   // Step 1 - Declaring variables
      int intQuantity = 5;
      double dblPrice, dblExtendedPrice, dblTaxPayable, dblTotalPayable;
      final double dblHST = 0.13; // 13% as a decimal is 0.13
   
   // Step 2 - (Input) Assigning values to variables
      intQuantity = 10;
      //dblHST = 0.14; // try this line by uncommenting it
      dblPrice = 10.69;
   
   // Step 3 - Processing
      dblExtendedPrice = intQuantity * dblPrice;
      dblTaxPayable = dblExtendedPrice * dblHST;
      dblTotalPayable = dblExtendedPrice + dblTaxPayable;
   
   // Step 4 - Output
      System.out.println ("the quantity is " + intQuantity);
      System.out.println ("the price is " + dblPrice);
      System.out.println ("the extended price is " + dblExtendedPrice);
      System.out.println ("the tax payable is " + dblTaxPayable);
      System.out.println ("the total payable is " + dblTotalPayable);
   
   // Place your code here
      } // main method
   } // Demo4UsingConstants class
