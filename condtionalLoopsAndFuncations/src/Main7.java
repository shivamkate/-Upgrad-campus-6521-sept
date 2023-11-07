//If number is even check divisible by 6  if it is odd check it is divisible by 3??
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n%2==0 )
        {
            System.out.println(n + "is even");

            if(n%6==0)
            {
                System.out.println(n+ "is an even and also divisible by 6");
            }
            else
            {
                System.out.println(n+"is an even number but not divisible by 6");
            }
        }
        else {
            System.out.println(n + "is odd number");

            if (n % 3 == 0) {
                System.out.println(n + "is odd number and it is divisible by 3");
            }
        }
    }
}