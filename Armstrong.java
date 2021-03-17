class Armstrong{
	static int a=154;
	static int sum=0;
	static int x;
	static int n=a;

	public static void main(String[] args) {
		while(a>0){
			x = a%10;
			a = a/10;
			sum = sum + (x * x * x);
		}
		System.out.println("sum = "+sum);
		if (sum==n) {
			System.out.println("armstrong number ");
		}
		
		else {
			System.out.println(" Not an armstrong number ");
		}
	}
}