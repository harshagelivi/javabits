package io;

import java.io.FileWriter;


public class FileIO
{

    public static void main(String[] args)
    {
        
        try
        {
            /*
             * creates the file if it doesn't exist
             * it is a connection stream that writes characters not bytes
             */
            FileWriter writer = new FileWriter("file2.txt");
            /*
             * doesn't need any chaining to write to file. this method does all work.
             */
            writer.write("hi");
            
            writer.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        

    }

}
