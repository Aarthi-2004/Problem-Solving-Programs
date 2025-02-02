import java.util.Scanner;
 class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter operation (a for addition, s for subtraction, m for multiplication, d for division, u for modulus): ");
        char operation = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int result = 0;
        boolean validOperation = true;
        switch (operation) {
            case 'a':
                result = num1 + num2;
                break;
            case 's':
                result = num1 - num2;
                break;
            case 'm':
                result = num1 * num2;
                break;
            case 'd':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            case 'u':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + num1 + operation + num2 + " = " + result);
        }

        sc.close();
    }
}
