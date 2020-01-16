import java.util.Scanner;

public class Duplicate_Char {
	public static void main(String[] args) {
		System.out.println("Find duplicate characters in a String \n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String text = sc.nextLine();
		//System.out.println(text);
		
		char[] dups = new char[100];
		int i, j, count = 0;
		
		System.out.println("The duplicate characters are : ");
		for(i=0; i<text.length(); i++) {
			for(j=i+1; j<text.length(); j++) {
				if(text.charAt(i) == text.charAt(j)) {
					System.out.print(text.charAt(j) +", ");					
					//dups[count] = text.charAt(j);					
					count++;
					break;
				}				
			}
		}
		//System.out.println(count);
	}
}
