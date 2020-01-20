package uebung;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Main o;
		o = new Main();
		
		o.out();
		o.put();
		
		Test t = new Test ();
		
		t.test();
		int e = t.add (8,2);
		System.out.println(e);
	}

	public void out() {
		System.out.println("hallo world");
	}
	public void put() {
		System.out.println("auto");
	}
	
}
