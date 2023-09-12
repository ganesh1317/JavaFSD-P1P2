package ArithematicCalculator;
import java.util.Scanner;

//class calculator
class Calculator {
    private double num1;
    private double num2;

    
    //here calculate handles the math operations
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }
    
    //here if num2 is not equal to 0 it perform division operation if not equal to 0 it throws an error 
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}


//here ArithematcCalculator handles user interaction
public class ArthematicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {

        
        //reading 1st input from user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        //reading 2nd input from user
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        
        Calculator calculator = new Calculator(num1, num2);

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = calculator.add();
                break;
            case '-':
                result = calculator.subtract();
                break;
            case '*':
                result = calculator.multiply();
                break;
            case '/':
                try {
                    result = calculator.divide();
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    
    
    System.out.print("Do you want to perform another calculation? (yes/no): ");
    String choice = scanner.next().toLowerCase();

    if (!choice.equals("yes")) {
        continueCalculation = false;
    }
   }
}
}

