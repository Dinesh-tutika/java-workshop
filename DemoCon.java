//TYPES OF CONSTRUCTORS
class Constructor
{
	String name;
	int rno;
	double cgpa;
	public Constructor(){
	
	}
	public void display(){
	System.out.println(name+"\t"+rno+"\t"+cgpa);
	}
	
}
class DemoCon
{
	public static void main(String...arg){
		Constructor c=new Constructor();
		//c.name="Dinesh";
		//c.rno=03;
		//c.cgpa=86.8;
		c.display();

	}
}