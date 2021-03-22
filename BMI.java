/* BMI = (mass or weight)/(height*height) */ 

class BMI{

	double a,b;

	void bmi(double x, double y)
	{
		double z;
		a = x;
		b = y;
		z = a/(b*b);
		System.out.println("BMI of a given weight and height is "+z);
	}

	public static void main(String[] args) {
		
		BMI obj = new BMI();
		obj.bmi(70, 1.79832);
	}
}