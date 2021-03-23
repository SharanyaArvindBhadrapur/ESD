class Lcd{

	void lcd(int x1, int y1, int x2, int y2)
	{
		System.out.println(+x1+"/"+y1);
		System.out.println(+x2+"/"+y2);
        
        int z = y1*y2;
        for(int i=1; i<=z; i++)
        {
        	int l1 = y1*i;
        	for(int j=1; j<=z; j++)
        	{
        		int l2 = y2*j;
        		if(l1 == l2){
        			System.out.println("LCD is "+l1);
        		}
        		break;
        		
        	}

        }
	}

	public static void main(String[] args) {
		
		Lcd obj = new Lcd();
		obj.lcd(3,3,7,18);

		Lcd obj1 = new Lcd();
		obj1.lcd(3,3,7,6);
	}
}