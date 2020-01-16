import java.util.Scanner;

public class AddBinary {
	public static void main(String[] args) {
		long bin1, bin2;
		int i=0, carry =0;
		
		int[] sum = new int[20];
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter first binary number: ");
		bin1 = sc.nextLong();
		if(isNotBinary(bin1)) {
			System.out.println("Invalid number, \n Enter binary number: ");
			bin1 = sc.nextLong();
		}
		System.out.print("Enter second binary number: ");
		bin2 = sc.nextLong();
		if(isNotBinary(bin2)) {
			System.out.println("Invalid number, \n Enter binary number: ");
			bin2 = sc.nextLong();
		}
		

		//closing scanner after use to avoid memory leak
		sc.close();
		while (bin1 != 0 || bin2 != 0) 
		{
			sum[i++] = (int)((bin1 % 10 + bin2 % 10 + carry) % 2);
			carry = (int)((bin1 % 10 + bin2 % 10 + carry) / 2);
			bin1 = bin1 / 10;
			bin2 = bin2 / 10;
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
	
	public static boolean isNotBinary(long n) {
		while(n!=0) {
			if(n%10 >1)
				return true;
			n= n/10;
		}
		return false;
	}

}
