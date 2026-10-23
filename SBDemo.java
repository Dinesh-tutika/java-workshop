//string buffer
import java.util.StringTokenizer;
import java.lang.StringBuffer;
class SBDemo{
	public static void main(String...arg){
		String str="Welcome to Java Coding";
		StringTokenizer st=new StringTokenizer(str,"	");
		StringBuffer sb=null;
		String temp=new String();
		StringBuffer result=new StringBuffer();
		while(st.hasMoreTokens()){
			temp=st.nextToken();
			sb=new StringBuffer(temp);
			result.append(sb.reverse());
			//System.out.println(sb.reverse() );
		}
		System.out.println(result);
	}
}