class Factors 
{
	public static int factors(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		//int num=6;
		System.out.println("The Factors of given number is :"+factors(12));
	}
}
