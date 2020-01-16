

import java.util.Scanner;
public class Even_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		if(n%2==0)
			System.out.println("Given Number is even");
		else
			System.out.println("Given number is odd");
		
		
	}
}
