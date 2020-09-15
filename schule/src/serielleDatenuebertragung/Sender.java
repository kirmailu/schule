package serielleDatenuebertragung;

public class Sender {
	
	int XON = 0x11;
	int XOFF = 0x17;
	int ETB = 0x17;
	
	public Sender() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sender();
	}
	public void SenderXONXOFF (int portnr){
		
	}
	public boolean oeffnePort(){
		if () {
			System.out.println("COM-Port wurde jetzt geöffnet...");
			if () {
				System.out.println("XON wurde empfangen!");
			} 
			return true;
		} else {
			return false;
		}
	}
	public int sendeText (String text){
		
	}
	public void schliessePort (){
		if () {
			System.out.println("COM-Port wurde jetzt geschlossen...");
		} else {
			System.out.println("Fehler beim Schließen der Schnittstelle");	
		}
	}
}
