package threadTest;

public class PrintThread extends Thread {
	private String Text;
	
public PrintThread(String text){
	this.Text = text;
}

public void run(){
	System.out.print(Text);
}

}
