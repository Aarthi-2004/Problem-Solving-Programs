import java.util.Scanner;
class NaturalNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();
      if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int sum = (n * (n + 1)) / 2;
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }  scanner.close();
    }
}