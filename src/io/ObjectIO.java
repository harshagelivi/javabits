package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectIO implements Serializable
{
    private int x;
    private String str;
    /*
     * marking as transient makes the variable to be not saved when serialized
     */
    transient private int tr;

    public static void main(String[] args)
    {
        ObjectIO obj = new ObjectIO();
        obj.x = 20;
        obj.str = "gelivi";
        obj.tr = 56;
        
        try
        {
            /* FileOutputStream writes bits to given file(connection stream). 
             * if the file doesn't exit it creates it
             */
            FileOutputStream fs = new FileOutputStream("file1.ser");
            
            /* ObjectOutputStream creates bits from objects. 
             * but can't write to a file(chain stream) and so it uses fs for that.
             */
            ObjectOutputStream os = new ObjectOutputStream(fs);
            
            /*
             * serializes and writes to the file
             */
            os.writeObject(obj);
            
            /*
             * closes the object stream which in turn closes the streams underneath it
             */
            os.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        

    }

}
