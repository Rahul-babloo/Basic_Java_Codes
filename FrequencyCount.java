import java.util.*;


public class FrequencyCount {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int[] arr={1,2,3,4,1,2,5,6,4,3,2,2,2};

        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            boolean isDuplicate=false;
            for(int k=i-1;k>=0;k--){
                if(arr[i]==arr[k]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate) {
                System.out.println(arr[i] + " : " + count);
            }

        }


    }
}
