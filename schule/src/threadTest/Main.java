package threadTest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintThread box = new PrintThread("hallo");
		box.start();
		ZahlThread kiste = new ZahlThread(1);
		kiste.start();
	}
}
