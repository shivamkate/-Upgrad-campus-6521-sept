//taking first name and last name from user and storing it in array;
import java.util.Scanner;
public class Main2{
    public static void main(String[]args)
    {
        String[] firstname;
        firstname = new String[5];
        String [] lastname;
        lastname = new String[5];
        System.out.println("Enter First name and Last name");
        System.out.println("For Five students ");
        Scanner  input = new Scanner(System.in);
        firstname[0]=input.nextLine();
        lastname[0]=input.nextLine();
        firstname[1]=input.nextLine();
        lastname[1]=input.nextLine();
        firstname[2]=input.nextLine();
        lastname[2]=input.nextLine();
        firstname[3]=input.nextLine();
        lastname[3]=input.nextLine();
        firstname[4]=input.nextLine();
        lastname[4]=input.nextLine();

        System.out.println("Roll Number Two First name is "+" "+
                firstname[2]+ " and last is" + " "+lastname[2]);


    }

}