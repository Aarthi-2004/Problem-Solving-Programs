import java.util.Scanner;
class EvenOddChecker{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
System.out.print("enter a number:");
int number = scanner.nextInt();
if(number%2==0){
System.out.println(number +"even");
}
else{
System.out.println(number + "odd");
}
}
} 
