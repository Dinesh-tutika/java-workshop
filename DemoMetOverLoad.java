/* Method OverLoading:::-Method names are ,but their signature is different
Method Signature:::-It has return type,no.of arguments types of arguments
*/
class MethodOverloading
{
	String s1,s2,s3;   		
	int a,b,c;
	int add(int x,int y){
		return x+y;
	}
	String add(String s1,String s2){
		return s1+s2;
	}
	/*public void display(){
		System.out.println(name+"\t"+rno+"\t"+cgpa);
	}*/
	
}
class DemoMetOverLoad
{
	public static void main(String...arg){
		MethodOverloading c=new MethodOverloading();
		System.out.println(c.add(10,30));
		System.out.println(c.add("Bits"," wgl"));
	}
}