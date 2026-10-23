import java.lang.StringBuffer;
import java.util.*;
class reverse{
	 public static void main(String...arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer number");
		int number=sc.nextInt();
		String s1=String.valueOf(number);
		StringBuffer sb=new StringBuffer(s1);
		String reverse=sb.reverse().toString();
		System.out.println(reverse);
		//if(reverse.equals(s1)) System.out.println("number is palindrome");
		//else system.out.println("not palindrome");
	}
}