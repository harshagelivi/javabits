package io;

import java.net.Socket;

public class ClientHandler implements Runnable{

	private Socket sock;
	public ClientHandler(Socket sock) {
		this.sock = sock;
	}
	@Override
	public void run() {
		
		
	}

}
