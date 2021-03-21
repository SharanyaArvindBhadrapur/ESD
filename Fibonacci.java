class Fibonacci{

	int a;

	void fibb(int x)
	{
		int f1 = 0, f2 = 1, f3 = 0;
		a = x;
		while (f3 < a)
        {
            f3 = f1 + f2;
            f1 = f2;  
            f2 = f3;
        }
         
        if(f3 == a)
        {
            System.out.println("Number belongs to Fibonacci series");
        }
        else
        {
            System.out.println("Number does not belong to Fibonacci series");
        }
    }   

	public static void main(String[] args) {
		
		Fibonacci obj = new Fibonacci();
		obj.fibb(8);

		Fibonacci obj1 = new Fibonacci();
		obj1.fibb(9);

		Fibonacci obj2 = new Fibonacci();
		obj2.fibb(13);

		Fibonacci obj3 = new Fibonacci();
		obj3.fibb(18);
	}
}