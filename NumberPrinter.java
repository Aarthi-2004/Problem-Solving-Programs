import java.util.Scanner;
class NumberPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        int i = 1;
        System.out.print("The first " + n + " natural numbers are ");
        for (; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(", ");
            }
        }

      sc.close();
    }
}
