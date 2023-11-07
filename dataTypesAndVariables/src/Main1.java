//getting discount on ticket
//1)condition age is less than equal to 30
//2)condition marks is greater than 75%
//3)having a license(driving)
import java.util.Objects;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = input.nextInt();
        System.out.println("Enter the Marks");
        int marks = input.nextInt();
        System.out.println("If You Have LICENSE Then type true otherwise type false");
        boolean license = input.nextBoolean();
        System.out.println(license);
        boolean result = age<30 && marks>=75 && license;
        System.out.println("YOUR OFFER IS :"+" "+result);


    }
}