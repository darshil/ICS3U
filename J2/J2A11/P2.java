import java.util.Scanner;
public class P2 {
	
	 public static void main (String[] args)  // end of line comment
	  {
		Scanner stdin = new Scanner(System.in);
		double userInput;	
		double fahrenheit; 
		
			System.out.println("Enter the temperature in Celsius");
			userInput =  stdin.nextDouble();
			
fahrenheit = (1.8 * userInput) + 32; 

System.out.println(userInput + " degrees in celsius is  "+ fahrenheit + " in fahrenheit");
			
			
			
			 
	  }

}
