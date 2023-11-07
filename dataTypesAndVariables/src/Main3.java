import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Enter Your Choice");
        System.out.print("  1:ADDITION\n  2:SUBTRACTION\n  3:MULTIPLICATION\n  4:DIVISION\n");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();


        System.out.println("Enter Two Numbers:");

        Scanner input1 = new Scanner(System.in);
        int x = input1.nextInt();
        int y = input1.nextInt();

        switch (a) {
            case 1:
                System.out.println("The ADDITION is: ");
                System.out.println(x + y);
                break;

            case 2:
                System.out.println("The Subtraction is:");
                System.out.println(x - y);
                break;
            case 3:
                System.out.println("The Multiplication:");
                System.out.println(x * y);
                break;

            case 4:
                float h = (float)x/y;
                System.out.println("The Division:");
                System.out.println(h);
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}