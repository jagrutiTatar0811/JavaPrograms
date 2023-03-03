class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=121;
		int reverse=0;
		int i;
		for(i=num; i!=0; i=i/10)
		{
			int rem= i%10; 
			reverse=reverse*10+rem;
		}
		
		if(num==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
