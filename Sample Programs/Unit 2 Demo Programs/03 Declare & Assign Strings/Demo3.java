//  Program Header Block
//  title of program
//  your name
//  date you created the program (programmers also document the revision dates here too
//  brief description of what the program does
//  A program to add two numbers.

public class Demo3
{
  public static void main (String[] args)  // end of line comment
  {
    
    // Step 1 - Declaring variables
    int markSubject1, markSubject2, markSubject3,markSubject4;
    int sumOfMarks, averageMark;
    double averageMarkDecimal;
    String nameOfStudent;
    
    // Step 2 - (Input) Assigning values to variables
    nameOfStudent = "Mr. Bozz";
    markSubject1 = 14;
    markSubject2 = 9;
    markSubject3 = 99;
    markSubject4 = 89;
    
    // Step 3 - Processing
    sumOfMarks = markSubject1 + markSubject2 + markSubject3 + markSubject4; // this is an expression
    averageMark = sumOfMarks/4;
    averageMarkDecimal = sumOfMarks/4.0;
    
    // Step 4 - Output
    System.out.println ("the sum of all the marks is " + sumOfMarks);
    System.out.println ("the average for "+ nameOfStudent+" is "+ averageMark);
    System.out.println ("the average for "+ nameOfStudent+" is "+ averageMarkDecimal);
    
    // Place your code here
  } // main method
} // Demo1 class
