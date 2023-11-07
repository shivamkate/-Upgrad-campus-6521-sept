//This programme return even or odd from user input number.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("Enter NO");
        Scanner input = new Scanner(System.in) ;

        int n = input.nextInt();

        boolean y = n%2==0;
        boolean z = !(n%2==0);
        System.out.println("  NOTE!!!\n (TRUE  = NUMBERS IS EVE)N\n (FALSE = NUMBER IS ODD)\n");
        System.out.println("The number is even"+ " "+y);
        System.out.println("The number is odd"+ " "+z);
    }
}