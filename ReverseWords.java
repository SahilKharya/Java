import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("the string :");
		String s = sc.nextLine();
		sc.close();
		//int i;
		String str[] = null;
		str = s.split(" ");
		//System.out
		int i;
		String rev=" ";
		for(i=str.length; i>0; i-- )
			rev = rev + str[i];
		System.out.print(rev);
	}
}
