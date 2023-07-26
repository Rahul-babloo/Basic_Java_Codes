public class CallByValue {

    public void CallByValue(int a){
        a=6;
        //return a;
    }
    public static void main(String[] args) {
        CallByValue obj=new CallByValue();
        int a=5;
        //.out.println(obj.Callbyvalue(a));
        System.out.println(a);
    }
}


