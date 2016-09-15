// Program to demonstrate creating random integers.
//
   public class DemoMathRandom
   
   {
      public static void main (String[] args)
      {
      
      // Declare variables
         double dblRandomNumber1, dblRandomNumber2;
         int intRollOfDie1;
         int intRollOfDie2;
      
      // INPUT
      
      
      // PROCESSING
         dblRandomNumber1 = Math.random (); // generate random double [0,1)
         dblRandomNumber2 = Math.random (); // generate random double [0,1)

         intRollOfDie2 = (int) (6 * dblRandomNumber2) + 1; // convert double to integer [1,6]
      
      
      // OUTPUT
         System.out.println ("the first random number is a double " + dblRandomNumber1);
         System.out.println ("6 x first random number " + (6 * dblRandomNumber1));
         System.out.println ("6 x first random number using integer casting (int) " + ((int) (6 * dblRandomNumber1)));
         System.out.println ("6 x first random number using integer casting (int) + 1 = " + ((int) (6 * dblRandomNumber1 + 1)));
         System.out.println ();
         System.out.println ("the second random number is a double " + dblRandomNumber2);
         System.out.println ("the second die roll is " + intRollOfDie2);
       
      // Place your code here
      } // main method
   } // DemoMathRandom class
