
import java.lang.StringBuffer;
class palandrome{
	 public static void main(String...arg){
		int number=15366351;
		String s1=String.valueOf(number);
		StringBuffer sb=new StringBuffer(s1);
		String reverse=sb.reverse().toString();
		if(reverse.equals(s1)) System.out.println("number is palindrome");
		else System.out.println("not palindrome");
	}
}