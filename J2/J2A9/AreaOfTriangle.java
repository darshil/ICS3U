//**********************************************************
// Assignment: J2A8
//
// Description: A program to calculate the Area of a Triangle given the base and height.
//
// Author: Darshil Patel 
//
// Date Start: Sept 27
// Date Completed: Sept 27
//
// Completion time: 20 mins
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from (enter the names of
//   others that helped with the assignment; write no one if
//   you received no help) in designing and debugging my program.
//*********************************************************

import javax.swing.*;
public class AreaOfTriangle
{
  public static void main (String[] args)
  {
	  
	  //declares the variables 
String  strBase, strHeight;
double dblBase =0 , dblHeight = 0, dblArea = 0; 

//(Input) Assigning values to variables

strBase = JOptionPane.showInputDialog ("Enter the triangle's base: ");
strHeight = JOptionPane.showInputDialog ("Enter the triangle's height: ");
dblBase = Double.parseDouble (strBase);
dblHeight = Double.parseDouble (strHeight);

//Processing

dblArea = dblBase * dblHeight / 2; // calculates the area of the triangle 


//Output
JOptionPane.showMessageDialog (null, "A triangle with base " + dblBase +
" units\nand height " + dblHeight +
" units\nhas an area of " + dblArea + " square units");

	  
  }
}