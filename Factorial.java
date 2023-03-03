//Factorial by using method call statement
class Factorial 
{
	public static int factorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		int num=5;
		System.out.println("Factorial Of Number : "+factorial(num));
	}
}


//public static void main(String[] args) 
	//{
		//int num=5;
		//int fact=1;
		//for(int i=1;i<=num;i++)
		//	{
		//		fact=fact*i;
		//	}
		//System.out.println("Factorial Of Number : "fact);
	//}