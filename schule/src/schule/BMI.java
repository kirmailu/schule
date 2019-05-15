package schule;

public class BMI {

	private double größe;
	private double gewicht;
	private double BMI;
	
	public BMI() {
		// TODO Auto-generated constructor stub
	}

	
	public void größe (double größe){
		this.größe = größe;
	}
	public void gewicht (double gewicht){
		this.gewicht = gewicht;
	}
	public double BMIber(){
		größe*= größe;
		BMI = gewicht/größe;
		return BMI;
	}
}
