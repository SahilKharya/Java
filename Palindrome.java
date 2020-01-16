import java.util.Scanner;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("\t Find Palindrome string - \n\n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str1 = sc.nextLine();
		
		//System.out.print(str1.length());
		String str2 = new String();
		int count=0;
		for(int i=str1.length()-1; i>=0; i--) {
			str2 = str2 + str1.charAt(i);
			//System.out.println(ch2);
		}
		System.out.println(str2);
				
		if(str1.equals(str2))
			System.out.print("This is a palindrome string");
		else
			System.out.print("This is not a palindrome string");
	}
}
