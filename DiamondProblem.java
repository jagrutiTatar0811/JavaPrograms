class DiamondProblem implements I1,I2 
{
	public void m1()
	{
		System.out.println("From m1() of class A");
	}
	public static void main(String[] args) 
	{
		DiamondProblem dp=new DiamondProblem();
		dp.m1();
	}
}
