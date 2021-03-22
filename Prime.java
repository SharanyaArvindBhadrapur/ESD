import java.lang.Math;
class Prime{

	public void primer()
	{

		while(a%2==0)
		{
			System.out.println(2 + " ");
			a = a/2;
		}
		//while(a!=0)
		//{
		for(i=3; i<=Math.sqrt(a); i=i+2)
		{
			while(a%i==0){
			//if(a%i==0){
				System.out.println(" " +i);
				a = a/i;
			//	i = 3;
			}
		}
		//}
		if(a>2)
			System.out.println(" "+a);
	}

	static int a=480, i;

	public static void main(String[] args) {

		Prime a1 = new Prime();
		a1.primer();
	}
}