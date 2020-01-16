import java.util.Scanner;

public class Duplicate_Char {
	public static void main(String[] args) {
		System.out.println("Find duplicate characters in a String \n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String text = scan.nextLine();		
		
		System.out.println("The duplicate characters are : ");
		for(int i=0; i<text.length(); i++) {
			for(int j=i+1; j<text.length(); j++) {
				if(text.charAt(i) == text.charAt(j)) {
					System.out.print(text.charAt(j) +", ");					
					break;
				}				
			}
		}
	}
}
