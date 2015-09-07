package reflection;

import basics.Base;
import basics.Derived;
import basics.Claface;
enum CONSTS {CONST1, CONST2}
public class Test implements Claface.doable
{
    static Object obj2;
    public static void main(String[] args) throws ClassNotFoundException
    {
        // TODO Auto-generated method stub
        Object obj1 = new Object();
        Base b = new Base();
        Derived d = new Derived();
        
        //Class c1 = obj1.getClass();
        Class c1 = Object.class;
        System.out.println(c1);
        
        Class c4 = CONSTS.CONST1.getClass();
        System.out.println(c4);
        
        
        //Class c5 = obj2.getClass(); // gives NPE
        
        int i;
        // CE
        //Class c6 = i.getClass();
        //CE
        //Class c7 = i.class;
        Class c8 = int.class;
        System.out.println(c8);

        
        Class c9 = Class.forName("basics.Derived");
        // .TYPE for wrappers
        Class c10 = Integer.TYPE;
    }
    @Override
    public void doit(Work w)
    {
        w.hours = 7;
        
    }

}
