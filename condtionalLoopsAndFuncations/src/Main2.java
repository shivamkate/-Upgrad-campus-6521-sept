//take file as a input and print all the words of the file?
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args)throws FileNotFoundException {

        File input = new File("C:/Users/pc/Desktop/number.txt");

        Scanner scan = new Scanner(input);

        while(scan.hasNextLine())
        {
            String s1 = scan.nextLine();
            System.out.println(s1);
        }
    }
}