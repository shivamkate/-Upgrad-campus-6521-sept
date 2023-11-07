/*

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

Process finished with exit code 0

 */
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            int star = 1;
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print("*");
                star = star+2;
            }

            System.out.println(" ");

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<2*n-2*i-1;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}