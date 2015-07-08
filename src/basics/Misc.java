package basics;

public class Misc
{

    public static void main(String[] args)
    {
        Base b = new Derived();
        method(b);

    }
    
    public static void method(Base b)
    {
        System.out.println("in base");
    }
    
    public static void method(Derived d)
    {
        System.out.println("in derived");
    }

}
