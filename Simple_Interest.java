import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		
		System.out.println("\t Calculate Simple Interest \n\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principle Value (P): ");
		double value = sc.nextDouble();
		System.out.print("Enter the Rate of Interest (r) : ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time duration(t) in years : ");
		int years = sc.nextInt();
		System.out.print("Enter the number of times interest is calculated per year :");
		int period = sc.nextInt();
		sc.close();
		
		int totalTime = period * years;  // total time of interest calculated
		double simpleInterest = value*(rate/100)*totalTime;
		System.out.println("The simple interest is : " + simpleInterest);
	}
}
