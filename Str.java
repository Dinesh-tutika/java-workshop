class Str{
	public static void main(String...arg){
		String clg="Balaji Institute of technology"+" Science, it is 			offering eight "+" in four years. There are three "+" sections in 		each year with "+"  around 60 students each.";
		String search="in";
		int index=clg.indexOf(search);
		if(index>0) System.out.println("found "+(index+1)+" position");
		else System.out.println(" Not found ");

		index=clg.lastIndexOf(search);
		if(index>=0) System.out.println("found "+(index+1)+" position");
		else System.out.println(" Not found ");
	}
}