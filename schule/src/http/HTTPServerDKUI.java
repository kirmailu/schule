package http;

public class HTTPServerDKUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HTTPServerDK hs = new HTTPServerDK(80); 
		hs.runServer();
		hs.beendeServer();
	}

}
