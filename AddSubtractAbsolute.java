import java.util.Scanner;
 class AddSubtractAbsolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        sc.close();
        int sum = num1 + num2;
        int absDiff = Math.abs(num1 - num2);
        System.out.println("Addition result: " + sum);
        System.out.println("Absolute Subtraction result: " + absDiff);
    }
}
