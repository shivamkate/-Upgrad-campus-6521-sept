//find the number is prime or not prime;
import java.util.*;
public class Main1 {
    public static void main(String[]args)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();

        prime1(n);

    }
    public static void prime(int n) {
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not Prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Prime");
        }
    }

    public static void prime1(int n)
    {
        int count=0;

        for(int i=1;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }

        if(count==2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not prime");
        }
    }

}