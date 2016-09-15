// The "AssignVsInputDemo.java" class.
   import javax.swing.JOptionPane;
   import java.text.*;
   public class DemoFormatOutput
   
   {
      public static void main (String[] args)
      {
      
      // Declare variables
      
         String strNumber;  
         double dblNumber;
         DecimalFormat df1 = new DecimalFormat("###0.00");  // this tells Java how you want to display a number
         DecimalFormat df2 = new DecimalFormat("##00.00");  // this tells Java how you want to display a number
         DecimalFormat df3 = new DecimalFormat("###0.000");  // this tells Java how you want to display a number
         DecimalFormat df4 = new DecimalFormat("$#,###.0000");  // this tells Java how you want to display a number
      
      // INPUT
      // The following statement prompts for input and assigns it to a string variable
      
         strNumber = JOptionPane.showInputDialog ("Enter a decimal number: ");

      // PROCESSING
      
         dblNumber = Double.parseDouble (strNumber); 
      
      
      // OUTPUT
         System.out.println (" rounding format 1 \n " + df1.format(dblNumber)); // this line uses the format above to display the result
         System.out.println (" rounding format 2 \n " + df2.format(dblNumber)); // this line uses the format above to display the result
         System.out.println (" rounding format 3 \n " + df3.format(dblNumber)); // this line uses the format above to display the result
         System.out.println (" rounding format 4 \n " + df4.format(dblNumber)); // this line uses the format above to display the result
      
      
      
      // Place your code here
      } // main method
   } // DemoModulusMathFormatOutput class
