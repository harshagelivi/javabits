package io;


import java.net.ServerSocket;
import java.net.Socket;

public class Server
{

    public static void main(String[] args)
    {
        try
        {
            /*
             * starts a server at 5678 port
             * serverSock represent the end point at server
             */
            ServerSocket serverSock = new ServerSocket(5678);
            while(true){
                /*
                 * blocks until a client is connected
                 * sock represents the end point at client
                 */
	            Socket sock = serverSock.accept();
	            
	            /*
	             * starts a thread to handle the client
	             */
	            ClientHandler h = new ClientHandler(sock);
	            Thread t = new Thread(h);
	            t.start();
            }    
            
          //  serverSock.close();
            
            
            

        } catch(Exception e) {
            e.printStackTrace();
        }



    }

}
