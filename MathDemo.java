import java.util.*;
import java.lang.Math.*;
class MathDemo{
	public static void main(String...arg){
		Random r=new Random();
		int a=Math.abs(r.nextInt()%9)+1;
		int b=Math.abs(r.nextInt()%9)+1;
		double c=Math.pow(a,b);
		double d=Math.sqrt(16);
		double e=Math.ceil(3.141617177);
		double f=Math.floor(3.141617177);
		double g=Math.round(3.141617177);
		double h=Math.cbrt(27);
		
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h);
		System.out.println(Math.max(a,b));
		System.out.println(Math.min(a,b));

	}
}
		