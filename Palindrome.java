import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        int num,sum=0,temp,r;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println(+temp+ " is a palindrome number");
        else
            System.out.println(+temp+ " is not a palindrome number");
        }
    }