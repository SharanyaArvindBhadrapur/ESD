/*square ends in the same digits as the number itself*/

class Automorphic{

	int a;

	void Autom(int x)
	{
		a = x;
		int n = a*a;
		while(x!=0)
		{
			if(x%10 != n%10)
			{
				System.out.println("Not an Automorphic number");
				break;
			}
			x = x/10;
			n = n/10;		
		}
		if(x==0)	
		System.out.println("Automorphic number");
	}

	public static void main(String[] args) {
		Automorphic obj1 = new Automorphic();
		obj1.Autom(625);

	}

}