package sever;

import java.io.IOException;

public class MyClientUI {

	public static void main(String[] args) {
		MyClient mc;
		try {
			mc = new MyClient (2000, "10.18.16.1");
			
			if (mc.verbinden()==true){
				
				for (int i = 0; i < 10; i++) {
					mc.abfragen('a');
					Thread.sleep(1000);
				}
				mc.abfragen('b');
			}
			else {
				System.out.println("Error");
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
