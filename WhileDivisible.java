import java.util.Scanner;
class  WhileDivisible
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
			if(start%3==0 && start%5==0)
			{
				System.out.println(start);
			}
			start++;
		}
		
	}
}

/*OUTPUT:

F:\java>javac WhileDivisible.java

F:\java>java WhileDivisible
Enter a Starting Number:
1
Enter a Ending Number:
100
15
30
45
60
75
90
*/