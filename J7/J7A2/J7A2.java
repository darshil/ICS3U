//**********************************************************
// Assignment: J7A2 Arrays
//
// Description: Copy the skeleton program below to jGrasp 
//              and complete it so that the values in twice[] 
//              and twiceL[] are twice the  values in val.
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

 class J7A2
 {
   public static void main ( String[] args )
   {
     int[] val = {13, -4, 82, 17};
     int[] twice = new int [4];
     twice[0] = val [0] * 2;
     twice[1] = val [1] * 2;
     twice[2] = val [2] * 2;
     twice[3] = val [3] * 2;
     System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
     System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
     //
     // Now repeat the process above using a for loop.
     //
     int[] twiceL = new int [4];
     System.out.println( "index -- Original -- New Array");
     for ( int i = 0 ; i < val.length ; i++)
     {
       twiceL[i] = val[i] * 2;
       System.out.println( i + " -- " + val[i] + " -- " + twiceL[i] );
      }
   }
   
 }
