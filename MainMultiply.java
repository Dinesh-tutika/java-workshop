class Multiply
{
	private int a,b,c;
	public Multiply(){
		a=20;
		b=10;
		c=0;
	}
	public void multiplication(){
		c=a*b;
	}
	public void display(){
		System.out.println("multiplication = "+c);
	}
}
class MainMultiply{
	public static void main(String...args){
		Multiply ob=new Multiply();
		ob.multiplication();
		ob.display();
	}
}
		
