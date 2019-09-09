package Betriebssystem;

public class PC {
	
	private static BS eins = new BS ("windows",1,1, new Prozess ("java",true,true,1),"samsung",1000);
	

	public static void main(String[] args) {
		eins.hinzufuegen(new Prozess("java",true,true,2));
		
		
		

	}

}
