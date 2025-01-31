import java.util.Scanner;
import java.util.stream.Stream;
 class StreamCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        Stream.of(operator).forEach(op -> {
            switch (op) {
                case '+':
                    System.out.println("Addition: " + (num1 + num2));
                case '-':
                    System.out.println("Subtraction: " + (num1 - num2));
                case '*':
                    System.out.println("Multiplication: " + (num1 * num2));
                case '/':
                    if (num2 != 0) {
                        System.out.println("Division: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                case '%':
                    if (num2 != 0) {
                        System.out.println("Modulus: " + (num1 % num2));
                    } else {
                        System.out.println("Cannot find modulus with zero.");
                    }
                default:
                    System.out.println("Invalid operator.");
            }
        });
        sc.close();
    }
}
