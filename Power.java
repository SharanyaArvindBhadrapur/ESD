class Power{

	int a,b;

	void power(int x, int p)
	{
		a = x;
		b = p;
        long result = 1;
            while (b != 0)
                {
                    result *= a;
                    b--;
                }
        System.out.println("Ans = " + result);
	}

	public static void main(String[] args) {

		Power obj = new Power();
		obj.power(2,5);

		Power obj1 = new Power();
		obj1.power(5,3);

		Power obj2 = new Power();
		obj2.power(4,5);
       
    }
}
