//**********************************************************
// Assignment: J7A1 Arrays
//
// Description: Copy the skeleton program below to jGrasp 
//              and complete it so that it computes the sum 
//              of all the numbers in each of the two arrays.
//
// Author: Darshil Patel
//
// Date Start: Dec 29, 2016
// Date Completed: Dec 29, 2016
//
// Completion time: 20 mins
//
// Honor Code: I pledge that this program represents my own
//   program code. I received help from no one in designing 
//   and debugging my program.
//*********************************************************

 class J7A1
 {
   public static void main ( String[] args )
   {

     // Compute the sum using only one expression.

     int[] intArray1 = {0, 1, 2, 3};
     int intSum1 = intArray1[1] + intArray1[2] + intArray1[3] + intArray1[0];
     System.out.println( "Sum of all numbers in first array = " + intSum1 );


     // Now repeat the process above using a for loop.

     int[] intArray2 = {4, 5, 6, 7};
     int intSum2 = 0;
     for ( int i = 0 ; i < intArray2.length  ; i++)
     {
       intSum2 = intSum2 + intArray2[i];
     }
     System.out.println( "Sum of all numbers in second array = " + intSum2 );
   }
 }
