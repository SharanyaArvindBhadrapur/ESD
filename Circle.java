/* program to find whether a circle is inside another circle or not. */

import java.lang.Math;
class Circle{

	void cir(int x1, int x2, int y1, int y2, int r1, int r2)
	{
		int d=0;
		d = (int) Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2)));

		if((d + r2) == r1)
		{
			System.out.println("Smaller circle lies inside the larger circle touching the cicumference of the larger circle");
		}
		else if((d + r2) < r1)
		{
			System.out.println("Smaller circle lies completely inside the larger circle without touching the circumference of the larger circle");
		}
		else
		{
			System.out.println("Smaller circle lies partially outside the larger circle");
		}
	}
    public static void main(String[] args) {
    	Circle obj = new Circle();
    	obj.cir(10, 1, 8, 2, 30, 10);

    	Circle obj1 = new Circle();
    	obj1.cir(10, 1, 8, 2, 30, 30);
    }
	
}