class Halfadder{

	int carry(int in1, int in2){
		 int a,b;
		 a = in1;
		 b = in2;
		 int ans;

		 int carr_ans;

		 carr_ans = a&b;
		 return carr_ans;
	}

	int sum(int in1, int in2){
		 int a,b;
		 a = in1;
		 b = in2;
		 int ans;

		 int sum_ans;
		 if(a==1 && b==1)
		 	sum_ans = 0;
		 else if(a==0 && b==0)
		 	sum_ans = 0;
		 else
		 	sum_ans = 1;

		 return sum_ans;

	}

	public static void main(String[] args) {
		int a,b;
		a=1;
		b=1;

		Halfadder ha = new Halfadder();
		System.out.println("Sum = "+ha.sum(a,b));
		System.out.println("Carry = "+ha.carry(a,b));
	}
}
