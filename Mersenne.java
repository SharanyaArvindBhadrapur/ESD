/*Mersenne Prime is a prime number that is one less than a power of two.  (2^k)-1*/

import java.lang.Math;
class Mersenne{

	int a;

	void circ()
	{
		double c=0, i=0;
		//a = x;
		for(int j=1; j<10; j++)
		    {
		    	while(i<j)
		            {
			            for(i=1; i<j; i++)
		                    {
			                    if((j%i)==0)
			                        {
				                        c++;
			                        }
		                    }
		                    //System.out.println(+c);
		                    if(c==1)
		                    {
		                    	//System.out.println("Prime "+i);
		                    	double x = Math.pow(2,i);
		                    	double y = x-1;
		                    	System.out.println("Prime "+y);
		                    }			                
		                    c = 0;
		            }

		    }

	}

	public static void main(String[] args) {
		
		Mersenne obj = new Mersenne();
		obj.circ();
	}
}