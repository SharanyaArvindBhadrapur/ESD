class Duck{

	int a,i;

	void duk(int x)
	{
		a = x;
		int count = 0, r, c=0;
		int y=0;
        while(a!=0)
        {
        	count++;
        	r = a%10;
        	a = a/10;
        	y = r + (y*10);
        	if(r==0)
        	{
        		c++;
        	}
        	
        }

        System.out.println("Length "+count);
        System.out.println("Zeros "+c);
        System.out.println("Rev " +y);
        if((y%10)!=0 && c>0)
        {
        	System.out.println("The number is a duck number");
        }
        else
        	System.out.println("The number is not a duck number");
	}

	public static void main(String[] args) {
		//int count = 0;
		Duck obj = new Duck();
		obj.duk(12345);

		Duck obj1 = new Duck();
		obj1.duk(10304);

		Duck obj2 = new Duck();
		obj1.duk(010304);
	}
}