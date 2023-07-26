import java.util.Scanner;

public class Prime {
    public static int fact(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 1;
        return n * fact(n - 1);


    }}

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
//        *
//        * *
//        * * *
//        * * * *
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}*/

//import java.util.*;
//    public class Prime
//    {
//        public static void main(String args[])
//        {
//            Scanner sc = new Scanner(System.in);
//            String s1=sc.nextLine();
//            String s2=sc.nextLine();
//            ntln("No");
//            }
//        }
//    }

