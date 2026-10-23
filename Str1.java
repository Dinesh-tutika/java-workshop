class Str1{
	public static void main(String...arg){
		String t1="balaji";
		String t2="Balaji";
		int result=t1.compareTo(t2);  //compare method is using here.
		
		if(result>0) System.out.println("t1>t2");
		else if(result<0) System.out.println("t1<t2");
		else System.out.println("t1=t2");
		int result1=t1.compareToIgnoreCase(t2);
		if(result1>0) System.out.println("t1>t2");
		else if(result1<0) System.out.println("t1<t2");
		else System.out.println("t1=t2");

	}
}