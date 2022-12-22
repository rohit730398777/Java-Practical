//2. Write a program take 2 Strings as input from user and find if
//First String Exists in Another

package strings;
import java.util.Scanner;

public class StringS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		
		System.out.print("Enter the First String:");
		String string2=src.nextLine();
		System.out.print("Enter the Second String:");
		String string3=src.nextLine();
		if(string3.contains(string2)) {
			System.out.println(string2 + " is a substring of " +string3);
		}
		else {
			System.out.println(string2 + " is not a substring of " + string3);
		}
		
		

	}

}
