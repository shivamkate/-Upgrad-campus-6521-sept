//write a function that check even or odd number;
import java.util.*;
public class Main3 {
    public static void evenodd(int n)
    {
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }

    public static void main(String[]args)
    {
        System.out.println("Enter the number");
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        evenodd(n);
    }
}