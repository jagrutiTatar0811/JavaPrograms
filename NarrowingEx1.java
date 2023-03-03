class NarrowingEx1 
{
	public static void main(String[] args) 
	{
		double a=10.0;
		int b=(int)a;//Narrowing
		System.out.println(a);//10.0
		System.out.println(b);//10
		
		double i=10.45;
		int j=(int)i;//Narrowing
		System.out.println(i);//10.45
		System.out.println(j);//10

		float k=3.14f;
		int l=(int)k;//Narrowing
		System.out.println(k);//3.14
		System.out.println(l);//3

		double x=67.58;
		char ch=(char)x;//Narrowing 
		System.out.println(x);//67.58
		System.out.println(ch);//c
	}
}
