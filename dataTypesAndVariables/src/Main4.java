//casting one datatype into different
//caste eveydata type in other menthion data type
//int,float,char,double,long,byte,shot

import java.util.Scanner;
public class Main4 {
    public static void main(String[]args)
    {



        System.out.println("Enter the Choice ");
        System.out.println("1: Integer\n"+"2: float\n"+
                "3: Character\n"+"4: Short\n"+"5: LONG\n"+"6: Double\n"+"7: byte\n");
        Scanner input = new Scanner(System.in);
        int sw = input.nextInt();



        switch(sw)
        {
            case 1:
                System.out.println("Enter the integer value");
                int i = input.nextInt();
                System.out.println(" Casting in Float = "+(float)i);
                System.out.println("Casting in Character ="+(char)i);
                System.out.println("Casting in Short = "+(short)i);
                System.out.println("Casting in Long = "+(long)i);
                System.out.println("Casting in Double = "+(double)i);
                System.out.println("Casting in Byte = "+(byte)i);
                break;

            case 2:
                System.out.println("Enter the float value");
                float f =input.nextFloat();
                System.out.println("Casting in Int = "+(int)f);
                System.out.println("Casting in Character = "+(char)f);
                System.out.println("Casting in short = "+(short)f);
                System.out.println("Casting in Long = "+(long)f);
                System.out.println("Casting in Double = "+(double)f);
                System.out.println("Casting in Byte = "+(byte)f);
                break;
            case 3:
                System.out.println("Enter the Character Value");
                char ch = input.next().charAt(1);
                System.out.println("Casting in Int = "+(int)ch);
                System.out.println("Casrting in Float = "+(float)ch);
                System.out.println("Casting in Short = "+(short)ch);
                System.out.println("Casting in Long = "+ (long)ch);
                System.out.println("Casting in Double = "+(double)ch);
                System.out.println("Casting in Byte = "+(byte)ch);
                break;

            case 4:
                System.out.println("Enter the Short Value");
                short s = input.nextShort();
                System.out.println("Casting in Int = "+(int)s);
                System.out.println("Casting in Float = "+(float)s);
                System.out.println("Casting in Char = "+(char)s);
                System.out.println("Casting in Long = "+(long)s);
                System.out.println("Casting in Double = "+(double)s);
                System.out.println("casting in Byte = "+(byte)s);
                break;

            case 5:
                System.out.println("Enter the Long value");
                long l = input.nextLong();
                System.out.println("Casting in Int = "+(int)l);
                System.out.println("Casting in Float = "+(float)l);
                System.out.println("Casting in Short = "+(short)l);
                System.out.println("Casting in Char = "+(char)l);
                System.out.println("Casting in Double = "+(double)l);
                System.out.println("Casting in Byte = "+(byte)l);
                break;

            case 6:
                System.out.println("Enter the Double value");
                double d = input.nextDouble();
                System.out.println("Casring in Int = "+(int)d);
                System.out.println("Casting in Float = "+(float)d);
                System.out.println("Casting in Char = "+(char)d);
                System.out.println("Casting in Short = "+(short)d);
                System.out.println("Casting in Long = "+(long)d);
                System.out.println("Casting in Byte = "+(byte)d);
                break;

            case 7:
                System.out.println("Enter the Byte value");
                byte b = input.nextByte();
                System.out.println("Casting in INT = "+(int)b);
                System.out.println("Casting in Float = "+(float)b);
                System.out.println("Casting in Char = "+(char)b);
                System.out.println("Casting in Short = "+(short)b);
                System.out.println("Casting in Long = "+(long)b);
                System.out.println("Casting in Double = "+(double)b);
                break;
            default :
                System.out.println("Something Went Wrong");
        }

    }
}