import java.lang.Math;
class Euclidean{

	static int x = 2, y = -1;
	static int a = -2, b = 2;
	static int d;

	public static void main(String[] args) {
		d = ((x-a)*(x-a))+((y-b)*(y-b));
		System.out.println("The distance between given points is "+Math.sqrt(d));
		
	} 
}