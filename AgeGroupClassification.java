import java.util.Scanner;
class AgeGroupClassification{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter age:");
int age = sc.nextInt();
if(age>=0 && age<=12){
   System.out.println("Child");}
else if(age>=13 && age<=19){
   System.out.println("Teenager");}
else if(age>=20 && age<=64){
   System.out.println("Adult");} 
else{
   System.out.println("Senior");}
}
}