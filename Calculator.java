import java.util.Scanner;

public class Calculator {
	public static void main() {
		System.out.println("the Calculator -\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("the first number :");
		double n1 = sc.nextInt();
		System.out.println("the second number :");
		double n2 = sc.nextInt();
		
		System.out.println("Select operation to be performed :\n 'a' for Add, 's' for Subtract, 'm' for multiply, 'd' for divide ");
		char op = sc.next().charAt(0);
		
		switch(op) {
		case 'a':
			double sum = n1 + n2;
			System.out.print("Addition of "+n1 +" and "+n2+" : "+ sum);
			
		case 's':
			double diff = n1 - n2;
			System.out.print("Difference of "+n1 +" and "+n2+" : "+ diff);
			
		case 'm':
			double mul = n1 + n2;
			System.out.print("Multiplication of "+n1 +" and "+n2+" : "+ mul);
			
		case 'd':
			double div = n1 + n2;
			System.out.print("Division of "+n1 +" and "+n2+" : "+ div);
		}
	}

}
