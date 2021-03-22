/*if each is equal to the sum of the proper divisors of the other */

class Amicable{

	int a;

	static int amic(int x)
	{
		int c=0, i=0, sum = 0;
		int a = x;
		while(i<a)
		{
			for(i=1; i<a; i++)
				if((a%i)==0)
				{
					c++;
					sum = sum + i;
				}
		}

		
		System.out.println("Factors "+c);
		System.out.println("SoF "+sum);
		return sum;
	}

	public static void main(String[] args) {
		//Amicable obj = new Amicable();
		//obj.amic(220);

		//Amicable obj1= new Amicable();
		//obj1.amic(284);

		//System.out.println(amic(2620));
		//System.out.println(amic(2924));

		if(amic(2620)==2924 && amic(2924)==2620)

		//if(obj.x==obj1.sum && obj1.x==obj.sum)
		System.out.println("The numbers are amicable");
		else
    	System.out.println("The numbers are not amicable");

	}
}