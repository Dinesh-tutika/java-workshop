import java.util.*;
class ScannerDemo{
	public static void main(String...ar){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer number");
		int a=sc.nextInt();
		System.out.println("Enter a Double value");
		double d=sc.nextDouble();
		System.out.println(a+"\n"+d);
	}
}