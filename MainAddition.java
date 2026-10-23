class Addition{
	private int a,b,c;
	public int getA(){
		return a;
	}
	public void setA(int a){
		this.a=a;
	}
	public int getB(){
		return b;
	}
	public void setB(int b){
		this.b=b;
	}
	public int getC(){
		return c;
	}
	public void setC(int c){
		this.c=c;
	}
	public void add(){
		setC(getA()+getB());
	}
}
class MainAddition
{
	public static void main(String...arg)
	{
		Addition ob=new Addition();
		ob.setA(123);
		ob.setB(200);
		ob.add();
		System.out.println("A="+ob.getA());
		System.out.println("B="+ob.getB());
		System.out.println("Sum="+ob.getC());
	}
}	