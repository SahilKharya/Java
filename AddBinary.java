import java.util.Scanner;

public class AddBinary {
		public static void main(String[] args) {
		long binary1, binary2;
		int i=0, carry =0;	
		int[] sum = new int[20];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first binary number: ");
		binary1 = scan.nextLong();
		if(isNotBinary(binary1)) {
			System.out.println("Invalid number, \n Enter binary number: ");
			binary1 = scan.nextLong();
		}
		System.out.print("Enter second binary number: ");
		binary2 = scan.nextLong();
		if(isNotBinary(binary2)) {
			System.out.println("Invalid number, \n Enter binary number: ");
			binary2 = scan.nextLong();
		}
		
		while (binary1 != 0 || binary2 != 0) 
		{
			sum[i++] = (int)((binary1 % 10 + binary2 % 10 + carry) % 2);
			carry = (int)((binary1 % 10 + binary2 % 10 + carry) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}
		if (carry != 0) {
			sum[i++] = carry;
		}
		--i;
		System.out.print("Sum is: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}	   
	}
	
	public static boolean isNotBinary(long number) {
		//method to check the number which is not binary
		while(number!=0) {
			if(number%10 >1)
				return true;		//true if number is not binary
			number= number/10;
		}
		return false;			//false if number is binary
	}
}
