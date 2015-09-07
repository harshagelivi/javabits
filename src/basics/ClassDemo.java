package basics;
/**
 * 
 * 
 */
public class ClassDemo
{
    public static void main(String[] args)
    {
        Derived d = new Derived();
        System.out.println(d.getClass().getName());
        System.out.println(Derived.class.getClassLoader());
        
        
        int[] arr1 = new int[5];
        int[] arr2 = new int[2];
        if(arr1.getClass() == arr2.getClass())
        {
            System.out.println(arr1.getClass());
            System.out.println(arr2.getClass());
        }
        
        
    }

}
