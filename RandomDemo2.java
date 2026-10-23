//Random class
import java.util.Random;
class RandomDemo2{
	public static void main(String args[]){
		Random a=new Random();
		int numberOne=Math.abs(a.nextInt()%9)+1;
		int numberTwo=Math.abs(a.nextInt()%9)+1;
		int result=numberOne+numberTwo;
		System.out.printf("n1=%5d\n",numberOne);
		System.out.printf("n2=%5d\n",numberTwo);
		System.out.printf("sum=%5d\n",result);
	}
}