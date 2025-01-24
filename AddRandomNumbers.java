import java.util.Random;
class AddRandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(100);
        int num2 = rand.nextInt(100); 
        int sum = num1 + num2;
        System.out.println("First Random Number: " + num1);
        System.out.println("Second Random Number: " + num2);
        System.out.println("Sum of the two random numbers: " + sum);
    }
}
