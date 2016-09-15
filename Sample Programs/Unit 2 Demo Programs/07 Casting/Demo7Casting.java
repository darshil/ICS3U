// The "Test" class.
import javax.swing.JOptionPane;
public class Demo7Casting
   {
   public static void main (String[] args)
      {
         
      System.out.println(6.0000000001);
      System.out.println(5.9999999999);  
   
      System.out.println((int)6.0000000001);
      System.out.println((int)5.9999999999);  
      
      
      System.out.println((int)6.0000000001);
      System.out.println((int)5.9999999999);  
      
      int a= 5;
      System.out.println("this is a "+a);
      double b = (double) a * 2;
      
      System.out.println("this is b "+b);
      
      int c = (int) b;
      System.out.println("this is c "+c);

      } // main method
   } // Test class
