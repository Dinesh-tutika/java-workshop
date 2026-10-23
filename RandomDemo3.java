//Random class 2 digit
import java.util.Random;
class RandomDemo3{
	public static void main(String...ar){    //public static void main(String args[]){   
		Random a=new Random();
		int numberOne=Math.abs(a.nextInt()%90)+10;
		int numberTwo=Math.abs(a.nextInt()%90)+10;
		int result=numberOne+numberTwo;
		System.out.printf("n1=%5d\n",numberOne);
		System.out.printf("n2=%5d\n",numberTwo);
		System.out.printf("sum=%5d\n",result);
	}
}