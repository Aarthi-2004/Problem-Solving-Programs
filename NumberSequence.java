import java.util.Scanner;
 class NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        
        sc.close();
    }
}
