class SrtingDemo{
	public static void main(String...arg){
		String str="Hello BITS";
		String str1="Hello BITS";
		System.out.println(str.hashCode()+"\n"+str1.hashCode());
		if(str==str1) System.out.println("Equal");
		else System.out.println("not equal");
		String str3=str;
		System.out.println(str3.hashCode());
		String s1=new String("Hello BITS");
		System.out.println(str1.hashCode());
		if (str==s1) System.out.println("not equal");
		else System.out.println("not equal");
		
		char clg[]={'b','i','t','s'};
		String s2=new String(clg);
		System.out.println(s2);

		int num=1236;
		String binary=Integer.toBinaryString(num);
		System.out.println("binary="+binary);
		String octal=Integer.toOctalString(num);
		System.out.println("octal="+octal);
		String hexa=Integer.toHexString(num);
		System.out.println("hex-Decimal="+hexa);

		String s4="1234";
		//String s=Integer.parseInt(s4,2);
		//System.out.println(s);
		System.out.println(Integer.toString(num,2));
	}
}





//strings are immutable because of it cannot modified
//string are called as SCP (String Constant Pole)


 