class Lcm{
	static int a = 2940, b = 3150, temp, r=1, lcm;
    static int p = a;
    static int q = b;

    public static void main(String[] args) 
    {
    	while(r>0)
    	{
    		r = a%b;
    		temp = b;
            b = r;
            a = temp;
        }
    	System.out.println("GCF: "+a);
    	lcm = ((p*q)/a);
    	System.out.println("LCM: "+lcm);
    }
    
}