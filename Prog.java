//Java Program to convert an integer to binary
import java.util.Scanner;
    public class Prog
    {
        public static void main(String[] args)
        {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number:");
            n = sc.nextInt();
            Prog obj = new Prog();
            int m = obj.binary(n);
            System.out.println("The binary equivalent is:"+m);
        }
        public static int binary(int n)
        {
            if (n == 1)
            {
                return 1;
            }
            return binary(n / 2) * 10 + n % 2;
        }
    }
