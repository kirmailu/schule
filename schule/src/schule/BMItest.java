package schule;

public class BMItest {

	public BMItest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BMI test = new BMI ();
		test.gewicht(60);
		test.größe(1.83);
		System.out.println(test.BMIber());
	}

}
