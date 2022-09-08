package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int value1 = in.nextInt();
		System.out.println("Enter another integer: ");
		int value2 = in.nextInt();
		double average = (value1 + value2)/2.0;
		System.out.println("Average of "+value1+" and "+value2+" is "+average+".");

	}

}
