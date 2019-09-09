package Betriebssystem;

public class Prozess {
	
	private String name;
	private boolean laufend;
	private boolean bereit;
	private int prio;

	
		
		public Prozess (String n, boolean b){
			this.name=n;
			this.bereit=b;
		}
		public Prozess (String n, boolean l, boolean b, int p){
			this.name=n;
			this.bereit=b;
			this.laufend=l;
			this.prio=p;
		}
		

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLaufend() {
		return laufend;
	}

	public void setLaufend(boolean laufend) {
		this.laufend = laufend;
	}

	public boolean isBereit() {
		return breit;
	}

	public void setBereit(boolean breit) {
		this.breit = breit;
	}

	public int getPrio() {
		return prio;
	}

	public void setPrio(int prio) {
		this.prio = prio;
	}

}
