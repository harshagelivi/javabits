package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client
{
    public static void main(String[] args)
    {
        
        try
        {
            /*
             * client connects to the server at 127.0.0.1
             * at port 5678
             */
            Socket sock = new Socket("127.0.0.1", 5678);
            
            
            InputStreamReader isr = new InputStreamReader(sock.getInputStream());
            
            BufferedReader br = new BufferedReader(isr);
            
            System.out.println(br.readLine());
            
            br.close();
            
            sock.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
        

    }

}
