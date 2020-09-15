public class Main{
  
  private String init = "horschemo";
  private String initResponse = "eijoo";
  private String endOfMessage = "feddisch";
  private String endOfMessageResponse = "habbisch";
  
  public Main() {
    try {
      Serial serial = new Serial("COM4", 9600, 8, 1, 0);
      
      serial.open();
      
      while (true) { 
        String response = serial.readLine();
        System.out.println(response);
        
        if (response.equals(init)) {
          break;
        }
      }
      
      serial.write(initResponse);
      
      while (true) { 
        String message = serial.readLine();
        System.out.println(message);
        
        if (message.equals(endOfMessage)) {
          break;
        }
      }
      
      serial.write(endOfMessageResponse);
      System.out.println(endOfMessageResponse);
    } catch(Exception e) {
      System.out.println("Blöd aber auch");
    }
  }
  
  public static void Main(String[] args) {
    new Main();
  }
}