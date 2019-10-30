package wuerfelleiter;

public class Leiterkarte {
	
	private boolean lk[];
	
	public Leiterkarte() {
		
	}
	public int eintragen (Wuerfel wuerfel[]) {
		
	}
	public int ermittleErreichteStufe(){
		
	}
	public void ausgabeLeiterkarte( String name) {
		System.out.println( name + "Leiterkarte:");
		for (int i = 6; i > 0; i--) {
			System.out.println( i + ": " );
		}
	}
	public boolean[] getLk() {
		return lk;
	}
	public void setLk(boolean[] lk) {
		this.lk = lk;
	}
	
}
