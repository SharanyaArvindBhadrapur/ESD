/* program to count the repeted occurance of a digit in a n-digit number */

class Repeat{

	int a,b;

	void repeat(int x, int y)
	{
		int count=0, r=0;
		a = x;
		b = y;
		while(a!=0)
		{
			r = a%10;
			a = a/10;
			if(r==b)
			{
				count++;
			}
		}
		System.out.println("Count "+count);
	}

	public static void main(String[] args) {
		
		Repeat obj = new Repeat();
		obj.repeat(22754722,2);
	}
}