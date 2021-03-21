/*Pronic: number which is the product of two consecutive integers, that is, a number of the form n(n + 1).*/

class Pronic{
	 int a;

	 void pro(int x)
	 {
	 	int p1=0, p2=0;
	 	a = x;
        while(p2<a)
        {
        	p2 = p1*(p1+1);
        	p1++;
        }
        if(p2==a)
        {
        	System.out.println("Pronic Number");
        }
        else
        {
        	System.out.println("Not a Pronic Number");
        }
	 }

	 public static void main(String[] args) {
	 	
	 	Pronic obj = new Pronic();
	 	obj.pro(20);

	 	Pronic obj1 = new Pronic();
	 	obj1.pro(21);

	 	Pronic obj2 = new Pronic();
	 	obj2.pro(30);
	 }
}