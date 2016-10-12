import java.util.*;
public class P1 {

	
	 public static void main (String[] args)  // end of line comment
	  {
		 String userName;
		 String subjectOne;
		 String subjectTwo;
		 String subject3;
		 int firstMark;
		 int secondMark;
		 int thirdMark; 
		 int average; 
		 Scanner stdin = new Scanner(System.in);

		 
		 System.out.println("Enter your name");
		 userName=  stdin.nextLine();
		 
		 System.out.println("Enter Subject 1");
		 subjectOne = stdin.nextLine(); 
		 System.out.println("Enter your " + subjectOne + " Mark");
		 firstMark = Integer.parseInt(stdin.nextLine());
		 
		 System.out.println("Enter Subject 2");
		 subjectTwo = stdin.nextLine();
		 System.out.println("Enter your " + subjectTwo + " Mark");
		 secondMark = Integer.parseInt(stdin.nextLine());
		 
		 System.out.println("Enter Subject 3");
		 subject3 = stdin.nextLine();
		 System.out.println("Enter your " + subject3 + " Mark");
		 thirdMark = Integer.parseInt(stdin.nextLine()); 
		 
		 
		 average = (firstMark + secondMark + thirdMark )/2;
		 
		 System.out.println("Hello " + userName);
		 System.out.println("---------------");
		 System.out.println(subjectOne + " Mark: " + firstMark);
		 System.out.println(subjectTwo + " Mark: " + secondMark);
		 System.out.println(subject3 + " Mark: " + thirdMark);
		 System.out.println("---------------");
		 System.out.println("Your average: " + average);
	 
	  }
}
