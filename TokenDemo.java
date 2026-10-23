import java.util.StringTokenizer;
class TokenDemo{
	public static void main(String...args){
		/*String clg="Balaji Institute of technology"+" Science, it is 			offering eight "+" in four years. There are three "+" sections in 		each year with "+"  around 60 students each.";*/
		String clg="Balaji-Institute-of-technology-and-Science";
		StringTokenizer st=new StringTokenizer(clg, "-");
		int count=st.countTokens();
		System.out.println(count);
		//dataType arrayName[10];
		//Syntex::dataType[] ArrayName=new dataType[size];
		String[] s=new String[count];
		int i=0;
		while(st.hasMoreTokens()){
			s[i]=st.nextToken();
			i++;
		}
		for(String v:s) System.out.println(v);
		
		
		
	}
}