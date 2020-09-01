package Serial;

public class Main {

	public static void main(String[] args) {
		Serial serial;
			try {
				serial = new Serial("COM3", 9600, 8, 2, 0);
				serial.open();
			} catch (Exception e) {
				System.out.println("Es funktioniert nicht");
				System.exit(0);
			}
			
			int data;
			while(true) {
				if(serial.dataAvailable() > 0) {
					data = serial.read();
					
					System.out.println("Wir haben empfangen: " + data);
				}
			}
	}

}
