import java.util.Scanner;
 class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.close();
       if (isLeapYear(year)) {
            System.out.println(year + " is a leap year. February has 29 days.");
        } else {
            System.out.println(year + " is not a leap year. February has 28 days.");
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
