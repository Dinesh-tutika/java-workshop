//Random class
import java.util.Random;
class RandomDemo{
	public static void main(String args[]){
		Random a=new Random();
		int numberOne=a.nextInt();
		int numberTwo=a.nextInt();
		int result=numberOne+numberTwo;
		System.out.printf("n1=%d\n",numberOne);
		System.out.printf("n2=%d\n",numberTwo);
		System.out.printf("sum=%5d\n",result);
	}
}