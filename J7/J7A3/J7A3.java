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

 class J7A3
 {
   public static void main ( String[] args )
    {
	  int[] valA = { 13, -22, 82, 17};
	  int[] valB = {-12, 24, -79, -13};
	  int[] sum = valA + valB;
	  
	  System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
	  
	  //
	  // Now repeat the process above using a for loop.
	  // 
	  int[] sumL = new int [4];
	  
	  System.out.println( "index -- sum");
	  for ( int i = 0; i < valA.length  ; i++)
	  {
	    sumL[i] = 
	    System.out.println( index + " -- " + sumL[i] );
	  }
	}
   
 }
