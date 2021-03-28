class AddrinByte
{
	public static void main(String args[]){
		int StartAddr = 23788;
		int EndAddr = 23998;
		int bytes = (EndAddr - StartAddr)/8;
		System.out.println("Memory size in bytes : "+bytes);
	}
}