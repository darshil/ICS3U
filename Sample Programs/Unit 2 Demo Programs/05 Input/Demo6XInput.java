//  Program Header Block
//  title of program
//  your name
//  date you created the program (programmers also document the revision dates here too
//  brief description of what the program does

import javax.swing.JOptionPane;
public class Demo6XInput
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables
    String strNumberA, strName;
    double dblNumberA;
    
    // Step 2 - (Input) Assigning values to variables
    strName = JOptionPane.showInputDialog ("Enter your name");
    strNumberA = JOptionPane.showInputDialog ("Enter number A");
    
    //Step 3 - Processing
    dblNumberA = Double.parseDouble (strNumberA); // turns the string into an integer number
    
    // Step 4 - Output
    JOptionPane.showMessageDialog (null, "Your name is " + strName);
    JOptionPane.showMessageDialog (null, "strNumberA is " + strNumberA +"\nbut think of it as \""+strNumberA+"\""); // the string looks like a number but is not
    JOptionPane.showMessageDialog (null, "dblNumberA is " + dblNumberA+"\nand you can do math with this "+dblNumberA); // the integer number is a number you can do math with
    JOptionPane.showMessageDialog (null, "for example, 2 times dblNumberA is " + (2 * dblNumberA));
    
    // Place your code here
  } // main method
} // Demo1 class
