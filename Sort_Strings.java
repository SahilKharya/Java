import java.util.Scanner;
public class Sort_Strings {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Number of Strings to sort: ");
	        int count = sc.nextInt();
	        Scanner scan2 = new Scanner(System.in);
	
	        String stringArray[] = new String[count];
	        System.out.println("Strings :");
	        for(int i=0; i<count;i++) {
	                stringArray[i] = scan2.nextLine();
	        }
	        String temporarySorting;
	        for(int i =0;i<count;i++) {
	                for(int j=0; j<count; j++) {
	                        if(stringArray[i].compareTo(stringArray[j])<0) {
	                                temporarySorting = stringArray[i];
	                                stringArray[i] = stringArray[j];
	                                stringArray[j] = temporarySorting;
	                        }
	                }
	        }
	        System.out.println("Sorted Strings :");
	        for(int i=0; i<count;i++) {
	        	System.out.println(stringArray[i]+", ");
	        }
	}
}
