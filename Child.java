class Parent
{
    String name;

    public Parent(String n)
    {
        name = n;
    }

}
public class Child extends Parent {
    String name;

    public Child(String n1, String n2)
    {

        super(n1);//passing argument to parent class constructor
        //System.out.println(this.name);
        this.name = n2;
        //System.out.println(this.name);
    }
    public void details()
    {
        System.out.println(super.name+" and "+name);
    }
    public static void main(String[] args)
    {
        Child cobj = new Child("Parent","Child");
        cobj.details();
    }
}