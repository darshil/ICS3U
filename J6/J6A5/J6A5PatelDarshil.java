import java.util.*;
import javax.swing.*;
public class J6A5PatelDarshil {
    public static void main(String[] args) {

        String userInput;
        int operationCount = 0;
        String firstNumber;
        String secondNumber;
        double num1;
        double num2;
        String operator;
        int equationLength;
        int i;

        System.out.println("Enter an expression");
        Scanner input = new Scanner(System.in);
        userInput = input.nextLine().toString();

        for (i = 1; i < userInput.length(); i++) {
            if ((userInput.charAt(i) == '+') ||
                (userInput.charAt(i) == '-') ||
                (userInput.charAt(i) == '/') ||
                (userInput.charAt(i) == '^') ||
                (userInput.charAt(i) == '*') || userInput.charAt(i) == '^' ) {
                operationCount = i;
                i = userInput.length() + 1;
            }
        }

        equationLength = userInput.length();
        firstNumber = userInput.substring(0, operationCount).trim();
        secondNumber = userInput.substring(operationCount + 1, equationLength).trim();
        operator = userInput.substring(operationCount, operationCount + 1).trim();
        num1 = Double.parseDouble(firstNumber);
        num2 = Double.parseDouble(secondNumber);

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        }else if (operator.equals("^")) {
            System.out.println(num1 / num2);
        }
    }
}
