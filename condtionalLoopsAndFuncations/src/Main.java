//finding a square or rectangle
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length");
        int l = input.nextInt();
        System.out.println("Enter the Width");
        int b = input.nextInt();



        if(l==b)
        {
            System.out.println("Square");
        }
        else
        {
            System.out.println("Rectangle");
        }

    }
}