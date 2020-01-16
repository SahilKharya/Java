
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Check if the year is a leap year or not \n \n \n Enter the Year :");
		int year = sc.nextInt();
		sc.close();
		if((year%4 ==0 && year%100 !=0) || year%400 == 0)
			System.out.println("year is a leap year");
		else
			System.out.println("year is not a leap year");
	}

}
