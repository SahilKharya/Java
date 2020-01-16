import java.util.Scanner;
public class Compound_Interest {
	public static void main(String[] args) {
		System.out.println("\t Calculate Compound Interest \n\n");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Principle Value (P) to be Compounded : ");
		double value = scan.nextDouble();
		System.out.print("Enter the Rate of Interest (r) : ");
		double rate = scan.nextDouble();
		System.out.print("Enter the time duration(t) in years : ");
		int years = scan.nextInt();
		System.out.print("Enter the number of times value is compounded per year :");
		int periods = scan.nextInt();
		scan.close();
		
		int times = periods * years;  // total time of interest compounded
		double compoundInterest = value * Math.pow(1+(rate/(100*periods)), times) - value;
		System.out.println("The compound interest is : " + compoundInterest);
	}
}
