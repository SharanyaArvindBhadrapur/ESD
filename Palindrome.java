class Palindrome{
	static int a = 12621;
	static int r, sum=0;
	static int p = a;

	public static void main(String[] args) {
		sum = 0;
		while(p>0){
			r = p%10;
    	    p = p/10;
    	    sum = ((sum*10) + r);
    	}

    	if(sum==a)
    		System.out.println("The number "+sum + " is a Palindrome");
	    else
	    	System.out.println("The number "+sum + " is not a Palindrome");

	}
}