import java.util.Scanner;
 class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println(a + " < " + b + " is " + (a < b));
        System.out.println(a + " <= " + b + " is " + (a <= b));
        System.out.println(a + " > " +  b + " is " + (a > b));
        System.out.println(a + " >= " + b + " is " + (a >= b));
        System.out.println(a + " == " + b + " is " + (a == b));
        System.out.println(a + " != " + b + " is " + (a != b));

        scanner.close();
    }
}
