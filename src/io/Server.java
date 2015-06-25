package io;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

    public static void main(String[] args)
    {
        try
        {
            ServerSocket serverSock = new ServerSocket(5678);
            
            Socket sock = serverSock.accept();
            
            PrintWriter pwriter = new PrintWriter(sock.getOutputStream());
            
            pwriter.println("Server at 5678");
            
            pwriter.close();
            
            serverSock.close();
            
            
            

        } catch(Exception e) {
            e.printStackTrace();
        }



    }

}
