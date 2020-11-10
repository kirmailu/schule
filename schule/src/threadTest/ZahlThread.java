package threadTest;

public class ZahlThread extends Thread {
	private int Zahl;
	
public ZahlThread(int zahl){
	this.Zahl = zahl;
}

public void run(){
	System.out.print(Zahl);
}
}

