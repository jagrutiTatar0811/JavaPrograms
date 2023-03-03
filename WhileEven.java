import java.util.Scanner;
class WhileEven 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a Starting Number:");
		int start=sc.nextInt();

		System.out.println("Enter a Ending Number:");
		int end=sc.nextInt();
	
		while(start<=end)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
			start++;
		}
		
	}
}
