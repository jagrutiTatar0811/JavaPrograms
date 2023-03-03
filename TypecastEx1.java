class TypecastEx1 
{
	public static void main(String[] args) 
	{
		int a=10;
		double b=a;//widening
		System.out.println(a);//10
		System.out.println(b);//10.0
		
		char ch='m';
		int i=ch;//widening
		System.out.println(i);//109
		System.out.println(ch);//m

		boolean k=true;
		//int a=k;//widening
		System.out.println(k);//true
	}
}
