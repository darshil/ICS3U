public class J3A5
{
   public static void main (String[] args)
   {

      int roll11, roll12, roll21, roll22, roll31;
      int roll32, roll41, roll42, roll51, roll52;
      int sum1, sum2, sum3, sum4, sum5;
      double average;
   

     
      roll11 = (int) (Math.random() * 6) + 1;
      roll12 = (int) (Math.random() * 6) + 1;
      sum1 = roll11 + roll12;
      roll21 = (int) (Math.random() * 6) + 1;
      roll22 = (int) (Math.random() * 6) + 1;
      sum2 = roll21 + roll22;
      roll31 = (int) (Math.random() * 6) + 1;
      roll32 = (int) (Math.random() * 6) + 1;
      sum3 = roll31 + roll32;
      roll41 = (int) (Math.random() * 6) + 1;
      roll42 = (int) (Math.random() * 6) + 1;
      sum4 = roll41 + roll42;
      roll51 = (int) (Math.random() * 6) + 1;
      roll52 = (int) (Math.random() * 6) + 1;
      sum5 = roll51 + roll52;
      average = (sum1 + sum2 + sum3 + sum4 + sum5)/5.0;

      System.out.println ("Die1 | Die2|Total");
      System.out.println("----------------");
      System.out.println ("  " + roll11 + "  |  " + roll12 + "  |  " + sum1);
      System.out.println ("  " + roll21 + "  |  " + roll22 + "  |  " + sum2);
      System.out.println ("  " + roll31 + "  |  " + roll32 + "  |  " + sum3);
      System.out.println ("  " + roll41 + "  |  " + roll42 + "  |  " + sum4);
      System.out.println ("  " + roll51 + "  |  " + roll52 + "  |  " + sum5);
      System.out.println ("Average roll is: " + average);
   }
}