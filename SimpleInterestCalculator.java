import java.util.Scanner;
 class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time period: ");
        double time = sc.nextDouble();
        sc.close();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
