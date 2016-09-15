//  Program Header Block
//  title of program
//  your name
//  date you created the program (programmers also document the revision dates here too
//  brief description of what the program does

import javax.swing.JOptionPane;
public class Demo5XInput
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables  
    String strNumberA, strName;
    int intNumberA;
    
    // Step 2 - (Input) Assigning values to variables
    strName = JOptionPane.showInputDialog ("Enter your name");
    strNumberA = JOptionPane.showInputDialog ("Enter number A");
    
    //Step 3 - Processing
    intNumberA = Integer.parseInt (strNumberA); // turns the string into an integer number
    
    // Step 4 - Output
    JOptionPane.showMessageDialog (null, "Your name is " + strName);
    JOptionPane.showMessageDialog (null, "strNumberA is " + strNumberA +"\nbut think of it as \""+strNumberA+"\""); // the string looks like a number but is not
    JOptionPane.showMessageDialog (null, "intNumberA is " + intNumberA+"\nand you can do math with this "+intNumberA); // the integer number is a number you can do math with
    JOptionPane.showMessageDialog (null, "for example, 2 times intNumberA is " + (2 * intNumberA));
    
    // Place your code here
  } // main method
} // Demo1 class
