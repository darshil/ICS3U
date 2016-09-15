//  Program to demonstrate CASTING
//  
   import javax.swing.JOptionPane;

   public class CastingDemo
   {
      public static void main (String[] args)
      {
      
      // Write your program here using the steps below...
      
      // Step 1 - Declare variables
         String strNumber1, strNumber2;
         int intNumber1, intNumber3;
         double dblNumber2, dblNumber4;
      
      // Step 2 - Input and/or assign values to variables
         strNumber1 = JOptionPane.showInputDialog ("Enter an integer number: ");
         strNumber2 = JOptionPane.showInputDialog ("Enter a decimal number: ");
      
      // Step 3 - Processing (calculations)
         intNumber1 = Integer.parseInt (strNumber1); // convert string to integer
         dblNumber2 = Double.parseDouble (strNumber2); // convert string to double
         intNumber3 = (int) dblNumber2; // cast the double as an int
         dblNumber4 = (double) intNumber1; // cast the int as a double
      
      // Step 4 - Output (print the final results)
         JOptionPane.showMessageDialog (null, "The integer is " + intNumber1 + " as double is " + dblNumber4 + 
            "\nThe double is " + dblNumber2 + " as integer is " + intNumber3); 
      
      }//end main method
   }//end class