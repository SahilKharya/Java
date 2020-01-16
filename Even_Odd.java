

import java.util.Scanner;
public class Even_Odd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = scan.nextInt();
		scan.close();
		if(n%2==0)
			System.out.println("Given Number is even");
		else
			System.out.println("Given number is odd");	
	}
}
