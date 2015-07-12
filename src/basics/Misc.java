package basics;

public class Misc
{

    public static void main(String[] args)
    {
        Base b = new Derived();
        Derived d = new Derived();
        Base b1 = new Base();
        b.staticShow();
        b.show();
        d.staticShow();
        b1.staticShow();
        
        //method(b);
        //b.show();
        //new Misc().nons_method(b);

    }
    
    public static void method(Base b)
    {
        System.out.println("in static with base");
    }
    
    public static void method(Derived d)
    {
        System.out.println("in static with derived");
    }

    public void nons_method(Base b)
    {
        System.out.println("in non-s with base");
    }
    
    public void nons_method(Derived d)
    {
        System.out.println("in non-s with derived");
    }

}
