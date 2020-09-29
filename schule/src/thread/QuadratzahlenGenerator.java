package thread;

 	import java.util.Random;

	public class QuadratzahlenGenerator extends Thread{
		private int n;
	 	private int waitTime;
	 	private Random rnd;
	 	
	public QuadratzahlenGenerator (int n, int waitTime){
		super ();
		this.n = n;
		this.waitTime = waitTime;
		rnd = new Random();
	}
	@Override
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print( rnd + 'Quadratzahl');
		delay (100);
	}



}
