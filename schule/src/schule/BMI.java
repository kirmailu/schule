package schule;

public class BMI {

	private double gr��e;
	private double gewicht;
	private double BMI;
	
	public BMI() {
		// TODO Auto-generated constructor stub
	}

	
	public void gr��e (double gr��e){
		this.gr��e = gr��e;
	}
	public void gewicht (double gewicht){
		this.gewicht = gewicht;
	}
	public double BMIber(){
		gr��e*= gr��e;
		BMI = gewicht/gr��e;
		return BMI;
	}
}
