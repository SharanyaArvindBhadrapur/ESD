class Hexa{

	int a;

	void hex(int x)
	{
		a = x;
		if(a==0000)
		{
			System.out.println("0");
		}
		else if(a==0001)
		{
			System.out.println("1");
		}
		else if(a==0010)
		{
			System.out.println("2");
		}
		else if(a==0011)
		{
			System.out.println("3");
		}
		else if(a==0100)
		{
			System.out.println("4");
		}
		else if(a==0101)
		{
			System.out.println("5");
		}
		else if(a==0110)
		{
			System.out.println("6");
		}
		else if(a==0111)
		{
			System.out.println("7");
		}
		else if(a==1000)
		{
			System.out.println("8");
		}
		else if(a==1001)
		{
			System.out.println("9");
		}
		else if(a==1010)
		{
			System.out.println("A");
		}
		else if(a==1011)
		{
			System.out.println("B");
		}
		else if(a==1100)
		{
			System.out.println("C");
		}
		else if(a==1101)
		{
			System.out.println("D");
		}
		else if(a==1110)
		{
			System.out.println("E");
		}
		else if(a==1111)
		{
			System.out.println("F");
		}
	}

	public static void main(String[] args) {
		
		Hexa obj = new Hexa();
		obj.hex(0001);
		Hexa obj1 = new Hexa();
		obj1.hex(1101);
	}
}