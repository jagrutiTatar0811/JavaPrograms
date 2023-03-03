class Employee
{
   String empname;
   int empid;
   double empsal;

	Employee(String name, int id, double sal)
	{
		this.empname=name;
		this.empid=id;
		this.empsal=sal;
	}

	public String toString()
	{
		return "Employee Name: "+empname+" Employee ID: "+empid+" Employee Salary: "+empsal;
	}
	 
	public boolean equals(Object o)
	{
		Employee e=(Employee)o;
		if(this.empsal==e.empsal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public int hashCode()
	{
		int a=empname.hashCode();
		int b=empid;
		int c=(int)empsal;
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee("Raj",101,40000.00);

		Employee e2=new Employee("Riya",121,35000.00);
		System.out.println("For First Constructor");
		System.out.println(e1);//toString()
		System.out.println(e1.hashCode());//hashCode()
		System.out.println(e1.equals(e2));//equals()
		System.out.println();
		System.out.println("For Second Constructor");
		System.out.println(e2);//toString()
		System.out.println(e2.hashCode());//hashCode()
		System.out.println(e1.equals(e2));//equals()

	}
}
