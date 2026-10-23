import java.util.Random;
class RandomClassDemo{
	public static void main(String args[]){
		Random r=new Random();
		int a=r.nextInt();
		int b=r.nextInt();
		int c=a+b;
		System.out.println(c);
	}
}
	