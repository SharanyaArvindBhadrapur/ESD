/*Fermat Number: (2^2^n)+1 */

import java.lang.Math;
class Fermet{

	double a;
	void ferm()
	{
		double y=0, z=0;
		//a = x;
		for(int i=0; i<11; i++)
		{
			y = Math.pow(2,i);
			z = (Math.pow(2,y)) + 1;
			System.out.println(+z);
		}

	}

	public static void main(String[] args) {
		
		Fermet obj = new Fermet();
		obj.ferm();
	}
}