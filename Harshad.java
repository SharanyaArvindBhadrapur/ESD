/* Harshad: The given number should be divisible by the sum of its digit.*/

class Harshad{

	int a;

	void harsh(int x)
	{
		int sum=0, r=0;
		a = x;
		while(a!=0)
		{
			r = a%10;
			a = a/10;
			sum = sum + r;
		}
		System.out.println("Sum "+sum);
		a = x;
		if((a%sum)==0)
		{
			System.out.println("The number is Harshad Number");
		}
		else
		{
			System.out.println("The number is not Harshad Number");
		}
	}

	public static void main(String[] args) {
		
		Harshad obj = new Harshad();
		obj.harsh(120);

		Harshad obj1 = new Harshad();
		obj1.harsh(121);
	}
}