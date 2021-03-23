/*program to find the area of a) Circle b) Rectangle c) Square d) trapezoid  e)rhombus  f) triangle*/

class Area{

	void arc(double r)
	{
		double a = 3.14*r*r;
		System.out.println("Area of Circle is "+a);
	}
	void arr(int l, int b)
	{
		int rec = l*b;
		System.out.println("Area of rectangle is "+rec);
	}
	void ars(int x)
	{
		int s = x*x;
		System.out.println("Area of square is "+s);
	}
	void art(int p, int q, int r)
	{
		int t = ((p+q)/2)*r;
		System.out.println("Area of trapezoid is "+t);
	}
	void arrh(double d1, double d2)
	{
		double rh = 0.5*d1*d2;
		System.out.println("Area of rhombus is "+rh);
	}
	void artr(double b, double h)
	{
		double tr = 0.5*b*h;
		System.out.println("Area of triangle is "+tr);
	}

	public static void main(String[] args) {
		
		Area obj = new Area();
		obj.arc(8);

		Area obj1 = new Area();
		obj1.arr(7,9);

		Area obj2 = new Area();
		obj2.ars(8);

		Area obj3 = new Area();
		obj3.art(4,6,2);

		Area obj4 = new Area();
		obj4.arrh(5,7);

		Area obj5 = new Area();
		obj5.artr(4,9);

	}
}