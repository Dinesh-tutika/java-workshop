class Student
{
	String studName;
	String branch;
	int studId;
	void display()
	{
	System.out.println(studName+" "+branch+" "+studId);
	}
}
class StudentMain
{
	public static void main(String...arg)
	{
		Student obj=new Student();
		obj.studName="Dinesh";
		obj.branch="CSD";
		obj.studId=03;
		obj.display();
	}
}