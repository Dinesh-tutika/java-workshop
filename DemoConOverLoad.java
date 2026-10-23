//TYPES OF CONSTRUCTORS-CONSTRUCTOR OVERLOADING
class Constructor
{
	String name;
	int rno;
	double cgpa;
	public Constructor(){
	
	}
	public Constructor(String name,int rno,double cgpa){
		this.name=name;
		this.rno=rno;
		this.cgpa=cgpa;
	}
	public void display(){
		System.out.println(name+"\t"+rno+"\t"+cgpa);
	}
	
}
class DemoConOverLoad
{
	public static void main(String...arg){
		Constructor c=new Constructor("Dinesh",03,86.8);
		c.display();
		Constructor c1=new Constructor();		
		c1.display();
	}
}