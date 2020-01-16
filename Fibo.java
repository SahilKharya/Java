import java.util.Scanner;
public class Fibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("the number of elements in series :");
		int count = sc.nextInt();
		
		System.out.print("Fibonacci Series : ");
		int i, n1=0, n2=1, n3; 
		for (i=1; i<=count;i++) {
			System.out.print(n1 + " ");
			n3 =n1+n2;
			n1 = n2;
			n2 = n3;		
		}
	}
}
