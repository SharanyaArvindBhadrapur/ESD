/*A cyclic number is an integer in which cyclic permutations of the digits are successive multiples of the number.*/

class Cyclic{
	   void cyclic(int num)
	   {
		int temp = num;
		int count = 0;
		int length = String.valueOf(num).length();
		int mask = 1, i, j;
		int digit;
		
		for( i = 0; i < length - 1 ; i++){
			mask = mask * 10;
		}

		for(i = 0; i < length; i++){
			digit = num % 10;
			num = num / 10;
			num = (digit * mask) + num;
			//System.out.println(num);
			
			for(j = 1; j <= length; j++)
			{
				if(num == (temp * j)){
					count++;
				}
			}
		}
		if(count == length){
			System.out.println("Number is cyclic");
		}
		else{
			System.out.println("Number is not cyclic");
		}
		
	}

	public static void main(String[] args) {
		
		Cyclic obj = new Cyclic();
		obj.cyclic(142857);

		Cyclic obj1 = new Cyclic();
		obj1.cyclic(142858);
	}
}