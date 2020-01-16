import java.util.Scanner;

public class Sort_Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Strings : ");
		int n = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);

		String str[] = new String[n];
		System.out.println("Strings :");

		for(int i=0; i<n;i++) {
			str[i] = sc2.nextLine();
		}
		String temp;
		for(int i =0;i<n;i++) {
			for(int j=0; j<n; j++) {
				if(str[i].compareTo(str[j])<0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("Sorted Strings :");
		for(int i=0; i<n;i++) {
		System.out.println(str[i]+", ");
		}
		
	}
}
