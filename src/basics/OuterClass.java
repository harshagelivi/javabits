package basics;

public class OuterClass
{
    
    private int prv;
    public int pub;
    protected int prot;
    static int stat;
    
    /*
     *  nested class can be declared private, public, protected, or package private
     *  
     */
    
    /*
     * a nested class declared as static doesn't have access 
     * to instance variables and methods of OuterClass but to static members
     */
    private static class StaticNestedClass
    {
        public void go()
        {
            int x = stat + 5;
//            int y = prv + 6;  // error
        }
    }

    /*
     * a non-static nested class - inner class
     * have access to OuterClass members(even if they are private)
     * 
     * associated with an instance of OuterClass(so it can't contain any static members)
     * 
     */

    class InnerClass
    {
        public void go()
        {
            int x = stat + 5;
            int y = prv + 6;
        }
        
    }
    
    public static void main(String[] args)
    {
        OuterClass outer = new OuterClass();
        
        /*
         * an instance of InnerClass can exist only within an instance of OuterClass
         * so this doesn't work
         * OuterClass.InnerClass inner = new OuterClass.InnerClass(); 
         */

        
        

    }

}
