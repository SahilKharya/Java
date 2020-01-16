import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("the number of elements in series :");
		int count = scan.nextInt();
		
		System.out.print("Fibonacci Series : ");
		int i, number1 = 0, number2 = 1, number3; 
		for (i=1; i<=count;i++) {
			System.out.print(number1 + " ");
			number3 =number1+number2;
			number1 = number2;
			number2 = number3;		
		}
	}
}
