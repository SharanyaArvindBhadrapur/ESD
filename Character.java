/*
class Character{

	void charac(int x)
	{
		while(x!=0)
		{
			 int r = x%10;
			for(int i=0; i<10; i++)
			{
				if(r>65)
				{
				System.out.println("The seq consists of a character");	
				}
				System.out.println(+r);
					x = x/10;
			}	
		}
		
	}

	public static void main(String[] args) {
		
		Character obj = new Character();
		obj.charac(1245'a'6);
	}
}
*/

class Character{
	public static void main(String args[]){
		int i;
		char ch;
		int flag = 1;
		String str1 = args[0];
		
		
		for(i = 0; i < str1.length() ; i++){
			ch = args[0].charAt(i);
			//System.out.println(ch);
			if((ch < '0') || (ch > '9')){
				flag = 0;
				break;
			}
		}
		
		if(flag == 1){
			System.out.println("No character present");
		}
		else{
			System.out.println("character present");
		}
		
	}
}