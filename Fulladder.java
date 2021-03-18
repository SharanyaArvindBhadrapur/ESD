class Fulladder{

	int sum(int in1, int in2, int in3){
		 int a,b,c;
		 a = in1;
		 b = in2;
		 c = in3;
		 int ans;

		 int sum_ans;
		 int sum_ans1;
		 if(a==1 && b==1)
		 	sum_ans = 0;
		 else if(a==0 && b==0)
		 	sum_ans = 0;
		 else
		 	sum_ans = 1;

         if(sum_ans==0 && c==0)
         	sum_ans1 = 0;
         else if(sum_ans==1 && c==1)
         	sum_ans1 = 0;
         else
         	sum_ans1 = 1;

		 return sum_ans1;

	}

	int carry(int in1, int in2, int in3){
		 int a,b,c;
		 a = in1;
		 b = in2;
		 c = in3;
		 int ans;

		 int and_ans, and_ans1, and_ans2, orr;

		 and_ans = a&b;
		 and_ans1 = b&c;
		 and_ans2 = a&c;

		 orr = and_ans|and_ans1|and_ans2;
		   
		 return orr;
	}

	public static void main(String[] args) {
		int a,b,c;
		for(a=0; a<2; a++){
			for(b=0; b<2; b++){
				for(c=0; c<2; c++){
				Fulladder fa = new Fulladder();
		System.out.print("Sum = "+fa.sum(a,b,c));
		System.out.println(" Carry = "+fa.carry(a,b,c));
	    }
        }
        }
    }
}