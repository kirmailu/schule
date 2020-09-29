
package thread;

 	import java.util.Random;

	public class QuadratwurzelGenerator extends Thread{
		private int n;
	 	private int waitTime;
	 	private Random rnd;
	 	
	public QuadratwurzelGenerator (int n, int waitTime){
		super ();
		this.n = n;
		this.waitTime = waitTime;
		rnd = new Random();
	}
	@Override
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.print( rnd + 'Quadratwurzel');
		delay (100); // in ms
	}

}
