import java.util.Scanner;

 class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int num = number;

        
        if (num == 0) {
            count = 1;
        } else {
           if (num < 0) {
                num = -num;
            }

            while (num > 0) {
                num = num / 10; 
                count++;}
        }

          System.out.println("The number of digits in " + number + " is: " + count);
    }
}
