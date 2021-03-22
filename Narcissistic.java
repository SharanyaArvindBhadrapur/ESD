/* Narcissistic number: An n-digit number that is the sum of the nth powers of its digits is called an n-narcissistic number*/

import java.lang.Math;
class Narcissistic{

	 int a;

	 void narci()
	 {
	 	int sum=1, r=0;
	 	int count = 0, summ=1;
	 	int x=0;
	 	//a = x;
	 	for(int i=1; i<1000; i++)
	 	{
	 		int y = i;
	 		//System.out.println(+y);
	 		sum = 0;
	 		count = 0;
	 		while(i!=0)
	 		{
	 			r = i%10;
	 			i = i/10;
	 		    count = count+1;
	 		}
	 		i = y;
	 		//System.out.println(+i);
	 		//System.out.println(+count);
	 		while(i!=0)
	 		{
	 			r = i%10;
	 			i = i/10;
	 			if(count==1)
	 			{
	 				sum = sum + (r);
	 			}
	 			else if(count==2)
	 			{
	 				sum = sum + (r*r);
	 			}
	 			else if(count==3)
	 			{
	 				sum = sum + (r*r*r); 
	 			}
	 			
	 		}
	 		i = y;

	 		//System.out.println("Sum "+sum);
	 		if(sum==y)
	 		{
	 			System.out.println("Narci "+sum);
	 		}
	 		//else
	 		//{
	 		//	System.out.println("Not Narci "+sum);
	 		//}
	 	}

	 }

	public static void main(String[] args) {
		
		Narcissistic obj = new Narcissistic();
		obj.narci();
	}

}