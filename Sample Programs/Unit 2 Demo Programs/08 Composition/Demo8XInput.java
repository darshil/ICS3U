//  Program Header Block
//  title of program
//  your name
//  date you created the program (programmers also document the revision dates here too
//  brief description of what the program does

import javax.swing.JOptionPane;
public class Demo8XInput
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables  
    String strName;
    int intNumberA;
    
    // Step 2 - (Input) Assigning values to variables
    strName = JOptionPane.showInputDialog ("Enter your name");
    
    // Step 3 - Processing
    // The OUPUT of one method can be used as the INPUT to another method...
    intNumberA = Integer.parseInt (JOptionPane.showInputDialog ("Enter number A")); 
    // No need to assign the String to a variable...the String representing the
    // number can be fed directly to the parseInt() method.
    
    // Step 4 - Output
    JOptionPane.showMessageDialog (null, "Your name is " + strName);
    JOptionPane.showMessageDialog (null, "intNumberA is " + intNumberA+"\nand you can do math with this "+intNumberA); // the integer number is a number you can do math with
    JOptionPane.showMessageDialog (null, "for example, 2 times intNumberA is " + (2 * intNumberA));
    
    // Place your code here
  } // main method
} // Demo1 class
