package io;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable{

	private Socket sock;
	public ClientHandler(Socket sock) {
		this.sock = sock;
	}
	@Override
	public void run() {
        PrintWriter pwriter;
        try {
            pwriter = new PrintWriter(sock.getOutputStream());
            
            pwriter.println("Server at 5678");
            
            pwriter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

		
	}

}
