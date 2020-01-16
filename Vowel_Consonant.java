
import java.util.Scanner;
public class Vowel_Consonant {

	public static void main(String[] args) {
		boolean vowel = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character to check vowel or consonant : ");
		char c = sc.next().charAt(0);
		char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		sc.close();
		
		for(int i=0; i<10; i++) {
			if(c == vowels[i])
				vowel = true;	
		}
		if(vowel == true)
			System.out.println("\nInput is a Vowel");
		else
			System.out.println("\nInput is a consonant");
	}

}
