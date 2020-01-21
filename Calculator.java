import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("the Calculator -\n");
		Scanner scan = new Scanner(System.in);
		System.out.println("the first number :");
		double number1 = scan.nextInt();
		System.out.println("the second number :");
		double number2 = scan.nextInt();
		
		System.out.println("Select operation to be performed :\n 'a' for Add, 's' for Subtract, 'm' for multiplytiply, 'd' for divideide ");
		char operation = scan.next().charAt(0);
		
		switch(operation) {
			case 'a':
				double sum = number1 + number2;
				System.out.print("Addition of "+number1 +" and "+number2+" : "+ sum);
				break;

			case 's':
				double difference = number1 - number2;
				System.out.print("difference of "+number1 +" and "+number2+" : "+ difference);
				break;

			case 'm':
				double multiply = number1 * number2;
				System.out.print("multiplication of "+number1 +" and "+number2+" : "+ multiply);
				break;

			case 'd':
				double divide = number1 / number2;
				if(number2 != 0)
					System.out.print("division of "+number1 +" and "+number2+" : "+ divide);
				else
					System.out.print("Error!!!      - infinite");
				break;

			default:
				System.out.println("Please select a valid operation.");
				return;
		}
	}
}
