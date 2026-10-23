// non-Static 
class MainDemo1{
	{						//non-static blocks
		System.out.println("Good Morning");
	}
	public static void main(String...args){
		System.out.println("Hello");
		MainDemo1 m=new MainDemo1();

	}
	static	
	{
		System.out.println("Good ");
	}
} 