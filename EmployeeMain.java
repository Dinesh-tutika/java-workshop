class Employee
{
	String empName;
	int empId;
	double salary;
	void display()
	{
	System.out.println(empName+" "+empId+" "+salary);
	}
}
class EmployeeMain
{
	public static void main(String...arg)
	{
		Employee obj=new Employee();
		obj.empName="Dinesh";
		obj.empId=384;
		obj.salary=80000.80;
		obj.display();
	}
}