//  Program Header Block
//  title of program
//  your name
//  date you created the program (and revision dates)
//  brief description of what the program does here too...
//  This program demonstrates concatenation; declaration and assignment of an int (integer)

   public class Demo1
   {
      public static void main (String[] args)  // end of line comment
      {
      
      // Examples of concatenation +
       /*  System.out.println ("this is string of characters " + "this is another string"); // example of concatenation
         System.out.println ("5 + 5");
         System.out.println (5 + 2);
         System.out.println ("some text " + (5 + 5));
      */
      // Declaring variables
        int age;  // declaration statement
      
      // Assigning values to variables
         age = 16;  // assignment statement - assign the number 16 to the variable 'age'
         //System.out.println ("age " + age);
         age = 15;
        // System.out.println ("age " + age);
      // Declaring and assigning a value together in the same statement
        int shoeSize = 12;
        String hello = "hey, how are you?";
      
      // Anywhere you use a literal number or string, you can use a variable
         System.out.println ("age " + 2*age + " shoe size " + shoeSize);
      System.out.println(hello);
      } // main method
   } // Demo1 class
