/* program that reads a number in inches, converts it to meters. */

class Inch{

	double a;

	void inc(double x)
	{
		a = x;
		double m = (a * 0.0254);
		System.out.println(" " +a + " inches = " +m + " meters ");
	}

	public static void main(String[] args) {
		
		Inch obj = new Inch();
		obj.inc(393);

		Inch obj1 = new Inch();
		obj1.inc(590.999);
	}
}