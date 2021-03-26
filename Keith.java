/*36. Implement a Program in Java to check whether a number is a Keith Number or not*/

class Keith{

	void kei(int num)
	{
		int temp = num;
		int[] arr1 = new int[100];
		int[] arr2 = new int[100];
		int length = String.valueOf(num).length();
		//System.out.println(length);
		int sum = 0, i, j = 0; 
		for(i = 0; num > 0; i++){
			arr1[i] = num % 10;
			//System.out.println(arr1[i]);
			num = num / 10;
		}
		i--;
		while(i >= 0){
			arr2[j] = arr1[i];
			//System.out.println(arr2[j]);
			i--; j++;
		}
		j = length - 1;
		while(sum < temp){
			sum = 0;
			for(i = 0; i < length; i++){
				sum = arr2[j - i] + sum;
			}
			j++;
			arr2[j] = sum;
			
			if(sum == temp){
				System.out.println("The given number is a Keith number");
				return;
			}
		}
		System.out.println("The given number is not a Keith number");

	}

	public static void main(String[] args) {
		
		Keith obj = new Keith();
		obj.kei(31331);

		Keith obj1 = new Keith();
		obj1.kei(31332);
	}
}