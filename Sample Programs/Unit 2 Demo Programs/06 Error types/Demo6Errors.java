/* This program demonstrates the 3 types of errors
 that you can experience with your program...
	1 - syntax error - caught by compiler - program will not compile (therefore cannot run)
	2 - run-time error - missed by compiler - program will crash (halt or stop working)
	3 - logical error - missed by compiler - program runs but gives unexpected output
*/
   import javax.swing.JOptionPane;
   public class Demo6Errors
   {
      public static void main (String[] args)
      {
      // Step 1 - Declare variables
         String strNumberOne;
         String strNumberTwo;  //comment out for syntax error
         int intNumberOne;
         int intNumberTwo;
         int intQuotient;
      
      // Step 2 - Input and/or assign values to variables
         strNumberOne  = JOptionPane.showInputDialog("enter number 1 ");
			
         strNumberTwo  = JOptionPane.showInputDialog("enter number 2 "); // enter "0" for a run-time error
      	
      
      // Step 3 - Processing (calculations)
         intNumberOne = Integer.parseInt(strNumberOne);
         //intNumberTwo = Integer.parseInt(strNumberTwo);
         intNumberTwo = Integer.parseInt(strNumberOne); // logical  error
      
         intQuotient = intNumberOne/intNumberTwo;
      
      // Step 4 - Output (print the final results)
      
 	JOptionPane.showMessageDialog (null, "number1 = " + intNumberOne);
 	JOptionPane.showMessageDialog (null, "number2 = " + intNumberTwo);
 	JOptionPane.showMessageDialog (null, intNumberOne + " / " + intNumberTwo + " = " + intQuotient);
     
     
      // Place your code here
      } // main method
   } // Test class
