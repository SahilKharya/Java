import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("\t Find Palindrome string - \n");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Text : ");
		String textLine = sc.nextLine();
		
		String reverseText = new String();
		for(int i=textLine.length()-1; i>=0; i--) {
			reverseText = reverseText + textLine.charAt(i);			
		}
		System.out.println(reverseText);				//printing the input text in reverse
				
		if(textLine.equals(reverseText))
			System.out.print("This is a palindrome string");
		else
			System.out.print("This is not a palindrome string");
	}
}
