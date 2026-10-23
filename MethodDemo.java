class MethodDemo{
	public static void main(String...arg){
	
	String text="Welcome to coding World";
	int len=text.length();
	System.out.println("length:"+len);
	String s1=text+" java";
	System.out.println(s1);
	String s3="bits bits";
	System.out.println(s3.toUpperCase());
	String s4="WARANGAL";
	System.out.println(s4.toLowerCase());

	//System.out.println(s1+text+" c++"));
	String search="to";
	int index=text.indexOf(search);
	if(index>0) System.out.println(search+" string found at "+(index+1)+"position ");
	else System.out.println("not found");
	}
}