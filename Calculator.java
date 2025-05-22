import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        char operator;
        double result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Simple Calculator ====");
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
            }
            default -> {
                System.out.println("Invalid operator.");
                return;
            }
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
