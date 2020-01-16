import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		
		System.out.println("\t Calculate Simple Interest \n\n");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Principle Value (P): ");
		double value = scan.nextDouble();
		System.out.print("Enter the Rate of Interest (r) : ");
		double rate = scan.nextDouble();
		System.out.print("Enter the time duration(t) in years : ");
		int years = scan.nextInt();
		System.out.print("Enter the number of times interest calculated per year :");
		int period = scan.nextInt();
		scan.close();
		
		int totalTime = period * years;  // total time of interest calculated
		double simpleInterest = value*(rate/100)*totalTime;
		System.out.println("The simple interest is : " + simpleInterest);
	}
}
