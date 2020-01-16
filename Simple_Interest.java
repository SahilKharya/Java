import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		
		System.out.println("\t Calculate Simple Interest \n\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principle Value (P): ");
		double P = sc.nextInt();
		System.out.print("Enter the Rate of Interest (r) : ");
		double r = sc.nextFloat();
		System.out.print("Enter the time duration(t) in years : ");
		int t = sc.nextInt();
		System.out.print("Enter the number of times interest calculated per year :");
		int n = sc.nextInt();
		sc.close();
		
		int time = n * t;  // total time of interest compounded
		//As per the formula,
		double SI = P*(r/100)*time;
		System.out.println("The simple interest is : " + SI);

	}
}
