import java.Math.*;
class MathDemo1{
	public static void main(String...arg){
	//String a="1234567890111213";
	//String b="1234567890111213";
	String s1="1234567890111213";
	String s2="1234567890111213";
	BigDecimal n1=new BigDecimal(s1);
	BigDecimal n2=new BigDecimal(s2);
	//int c=a+b;
	BigDecimal n3=n1.add(n2);
	System.out.println(n3);
	}
}
