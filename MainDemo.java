//Static Vs non-Static 
class MainDemo{
	static{
		System.out.println("Good Morning");
	}
	public static void main(String...args){
		System.out.println("Hello");
	}
	static{
		System.out.println("Good Evening");
	}
} 