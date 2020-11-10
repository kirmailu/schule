package sever;

import java.io.IOException;

public class MyClient {
	
		private int port;
		private String host;
		private Socket clientSocket;

	public MyClient (int port, String host) throws IOException{
		this.port = port;
		this.host = host;
		clientSocket = new Socket (host,port);	
	}
	public boolean verbinden (){
		if (clientSocket.connect()==true){
			return true;
		}
		return false;
	}
		
	public void abmelden () throws IOException{
		clientSocket.close ();
	}
	public boolean abfragen (char x) throws IOException{
		if (x == 'a'){
			System.out.println("a read");
			this.clientSocket.write ((int) x );
			String s = this.clientSocket.readLine();
			System.out.println(s);
			return true;
			}
		
		if (x == 'b'){
			this.clientSocket.write ((int) x);
			return true;
		}
		return false;
}
	}
