class person1
{
    String firstname;
    String lastname;
    int age;
    person1(String fn,String ln,int a)
    {
        firstname=fn;
        lastname=ln;
        age=a;
    }
String getfullname()
{
    return(firstname+lastname);
}
}
public class person
{
    public static void main(String  args[])
    {
        person1 p1=new person1( "John","Doe",30);
        person1 p2=new person1( "Alice","Smith",25);
        System.out.println("person 1: "+p1.getfullname());
        System.out.println("person 2: "+p2.getfullname());
        double a1 =(p1.age+p2.age/2);
        System.out.println("Average Age: "+a1);
    }
}
    