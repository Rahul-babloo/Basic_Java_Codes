import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        for(int i=s.length()-1;i>=0;i--)        //execute until condition i>0 becomes false
        {
            r=r+(s.charAt(i));
        }
        System.out.println(r);

    }

}
