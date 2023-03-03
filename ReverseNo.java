class ReverseNo 
{
	public static int reverseno(int n)
	{
		int rev=0;
		for(int i=n;i!=0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		System.out.println("Reverse Of Given number : "+reverseno(1234));
	}
}
