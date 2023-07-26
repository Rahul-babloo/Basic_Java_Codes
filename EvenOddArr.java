//Given an array with N numbers and separate those numbers into two
// arrays by odd numbers or even numbers. The complete operation required
// ONo time complexity in the best case. For optimizing the memory uses the
// first traverse through an array and calculates the total number of even and
// odd numbers in it. Create two arrays with size calculated after traversing
// and start storing them.


import java.util.Scanner;

public class EvenOddArr {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        int even[]=new int[n];
        int odd[]=new int[n];
        int ev=0;
        int od=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even[ev]=arr[i];
                ev++;
            }
            else{
                odd[od]=arr[i];
                od++;
            }
        }

        if (od == 0) {
            System.out.println(od);
        }
        else{
            for(int ele:odd){
                if(ele!=0) {
                    System.out.print(ele + " ");
                }
            }
            System.out.println();
        }
        if(ev==0){
            System.out.println(ev);
        }
        else{
            for(int ele:even){
                if(ele!=0) {
                    System.out.print(ele + " ");
                }
            }
        }

    }


}


