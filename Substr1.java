class Substr1{
	public static void main(String...arg){
		String str="Hello World";
		char[] cA=new char[ str.length()];
		cA=str.toCharArray();
		for(char c:cA){
			System.out.println(c+"	");
		}
	}
}