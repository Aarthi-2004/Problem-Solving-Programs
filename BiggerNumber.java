 import java.util.Scanner;
 class BiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("The bigger number is: " + a);
        } else if (b > a) {
            System.out.println("The bigger number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
