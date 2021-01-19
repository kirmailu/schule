import java.io.IOException;
import java.util.Date;

package http;

public class HTTPServerDK {
	
	private int localPort;
}

public HTTPServerDK (int Port){
	
	try {
	      
	      this.localPort = port;
	      
	      this.serverSocket = new ServerSocket(port);
	      
	      System.out.println("\nHTTPServerDK wurde am Port " + port + " gestartet...\n");
	     
	    } 
	    catch (IOException e){
	      System.err.println("Der Server kann am Port " + port 
	      + " nicht gestartet werden.");
	    }
	  }

public void runServer(){
	while(true){
		try {
	        
	        System.out.println();
	        System.out.println("HTTPServerDK läuft und wartet auf Verbindungsanfragen...");
	        System.out.println();      

	        this.client = serverSocket.accept(); 
	        
	        System.out.println("\nEin Client ist verbunden ...\n");
	      } 
	      catch (IOException e) {
	        System.err.println("Fehler bei Client-Verbindung am Server: \n" + e);
	      }
	      
	      try{
	         
	        String request = "";  
	        String zeile = "";
	        
	        int zaehler = 0;
	        
	        do{
	       
	          zeile = this.client.readLine();
	          
	          if(zeile == null){
	           
	            System.out.println("Eine Zeile als \"null\" erhalten.");
	            break; 
	          }
	          
	          request = request + zeile + "\n";
	        
	        zaehler++;
	          
	        }while(!(zeile.length() == 0));  
	        
	        System.out.println("Erhaltener Request:\n\n" + request);
	     
	        String response = this.execute(request);
	        
	        System.out.println("Gesendeter Response:\n");
	        System.out.println("\"" + response + "\"");
	       
	        this.client.write(response + '\n');
	        
	        this.client.close();
	            
	        System.out.println("\nEin Client wurde getrennt ...\n");
	      }
	      catch (IOException e) {
	        System.err.println("Fehler bei Client-Verarbeitung am Server: \n" + e);
	      }
	}
		
}

private String execute(String request){
String response = "";
    
    
    if (request.startsWith("GET / HTTP/1.1")){
      
      System.out.println("Execute den Request: \"GET / HTTP/1.1\"\n");
    
      response = "HTTP/1.1 200 OK\r\n" + 
                 "Server: HTTPServerDK: 1.0\r\n" + 
                 "Connection: close\r\n" +     
                 "\r\n" + 
                 "Antwort von HTTPServerDK auf:\r\n\r\n" +
                 request;
      
      Date d = new Date();
      
      response = response +
                 "Information vom HTTP-Server-System:\n\n" +
                 "Datum und Uhrzeit des Server-Systems: " + d.toString() + "\n";
        
    }
    
    
    if (request.startsWith("GET /favicon.ico HTTP/1.1")){
      
      System.out.println("Execute den Request: \"GET /favicon.ico HTTP/1.1\"\n");
      
      response = "HTTP/1.1 200 OK\r\n" + 
                 "Server: HTTPServerDK: 1.0\r\n" + 
                 "Connection: close\r\n" +  
                  "\r\n" + 
                 "Antwort von HTTPServerDK auf Anfrage favicon.ino.";

    }    

    return response;
  }  
  


public void beendeServer(){
	
	try {
	      this.serverSocket.close();
	    } 
	    catch (IOException e){
	      System.err.println("Fehler beim Schliessen des Server-Sockets: \n" + e);
	    }
	  }
}