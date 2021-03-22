/* Pell number: (2*P[n-1])+P[n-2] where first two numbers are 0 and 1 */

class Pell{

	int a;

	void pel()
	{
		int p1=0, p2=1, p3=0;
		System.out.println(+p1);
		System.out.println(+p2);
		for(int i=0; i<13; i++)
		{
			p3 = (2*p2) + p1;
			System.out.println(+p3);
			p1 = p2;
			p2 = p3;
			
		}
	}

    public static void main(String[] args) {
    	Pell obj = new Pell();
	    obj.pel();
    }
	

}