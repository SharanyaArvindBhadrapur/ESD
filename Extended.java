/*Circular Prime: prime number with the property that the number generated at each intermediate step when cyclically permuting its (base 10) digits will be prime.*/
/*written for 4 digit numbers*/

import java.lang.Math;
class Extended{

	long a;

	void ext(long x)
	{
		long r, z;
		a = x;
		long y=a;
		//System.out.println(+y);
		while(a==y)
		{
			for(int i=0; i<4; i++)
			{
				//a = y;
				for(int j=0; j<i; j++)
				{
					r = a % 10;
		            a = a/10;
		            //z = (Math.pow(10, 3));
		            a = (a + (r*1000));  
				}
				System.out.println(+a);
				int c=0, k=0;
		        //a = x;
		        while(k<a)
		        {
			        for(k=1; k<a; k++)
		            {
			            if((a%k)==0)
			                {
				                c++;
			                }
		            }
		        }  
		//System.out.println("Count "+c);
		if(c==1)
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
			}
	    }
	    

	}

	public static void main(String[] args){
		
		Extended obj = new Extended();
		obj.ext(1193);

		Extended obj1 = new Extended();
		obj1.ext(3779);

		Extended obj2 = new Extended();
		obj2.ext(3756);
	}

}