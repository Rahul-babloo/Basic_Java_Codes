import java.util.*;
public class Sum{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        Sum obj = new Sum();
        int m = obj.binary(n);
        System.out.println(+m);
    }
    public static int binary(int n){
        if( n == 1){
            return 1;
        }
        return (n / 2) * 10 + n % 2;
    }
}
