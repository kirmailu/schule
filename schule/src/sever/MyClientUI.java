package sever;

import java.io.IOException;

public class MyClientUI {

	public static void main(String[] args) {
		MyClient mc;
		try {
			mc = new MyClient (4711, "10.18.16.3");
			
			if (mc.verbinden()==true){
				
				new Thread(()->{
					while (true) {
						try {
							mc.sendCommand("givea");
							Thread.sleep(100);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}).start();
				
				while(true){
					mc.abfragen('a');
					Thread.sleep(1000);
				}
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
