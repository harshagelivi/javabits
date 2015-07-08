package basics;

/*
 *  Interfaces are inherently static, so we can't declare them inside a class
 */
public class Local
{
    public static int pub;
    private static int priv;
    protected static int prot;

    public static void main(String[] args)
    {
        int m;
        for(int i=0; i<10; i++)
        {
            class Level1
            {
                public int k;
                //public static int j = 0;
                
                public Level1()
                {
                    /*
                     * m and i can't be accessed.
                     * local class can only access the local variables that are final 
                     */
                    pub++;
                    priv++;
                    prot++;
                }
                
            }
            
        }
        
        

    }

}
