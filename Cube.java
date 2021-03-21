class Cube{

	int a;

	void cube(int x)
	{
		a = x;
		for(int i=0; i<a; i++)
		{
			if((i*i*i)==a)
			{
				System.out.println("Its a perfect cube");
				break;
			}
			else if((i*i*i)>a)	
			{
		        System.out.println("Not a perfect cube");
		        break;
	        }
	    }
	}

	public static void main(String[] args) {
		
		Cube obj = new Cube();
		obj.cube(27);

		Cube obj1 = new Cube();
		obj1.cube(28);
	}
}