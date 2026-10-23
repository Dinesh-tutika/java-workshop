class Sample{
	static int b=30;
	
}
class MainStaticNonStaticDemo{
	
	int a=20;
	public static void main(String...args){
		MainStaticNonStaticDemo m=new MainStaticNonStaticDemo();
		System.out.println(m.a+"\t"+Sample.b);
	}
} 