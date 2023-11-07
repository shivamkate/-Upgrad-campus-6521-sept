/*
        A
        A B
        A B C
        A B C D
        A B C D E
*/

import java.util.Scanner;
public class Main6 {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();

        char ch = 'A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }

            System.out.println();
            ch = 'A';
        }

    }
}