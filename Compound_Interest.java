
import java.util.Scanner;
public class Compound_Interest {
	public static void main(String[] args) {
		System.out.println("\t Calculate Compound Interest \n\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principle Value (P) to be Compounded : ");
		double P = sc.nextInt();
		System.out.print("Enter the Rate of Interest (r) : ");
		double r = sc.nextFloat();
		System.out.print("Enter the time duration(t) in years : ");
		int t = sc.nextInt();
		System.out.print("Enter the number of times value is compounded per year :");
		int n = sc.nextInt();
		sc.close();
		
		int time = n * t;  // total time of interest compounded
		//As per the formula, Compound Interest = P(1+(r/(100*n)))^time
		double CI = P * Math.pow(1+(r/(100*n)), time) - P;
		System.out.println("The compound interest is : " + CI);
	}
}
