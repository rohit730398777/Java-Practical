//1. Write a program take 2 strings as input from the 
//user and find if both the strings are same or not.
package strings;
import java.util.Scanner;

public class StringS1 {
	public static void main(String args[]) {
	     Scanner src=new Scanner(System.in);
		System.out.print("Enter the First String:");
		String st1=src.nextLine();
		System.out.println("Enter the Second String:");
		String st2=src.nextLine();
		if(st1.equals(st2)) {
			System.out.println("Congrats Your String Got Successfully Matched");
		}else {
			System.out.println("String does not Matched");
		}
		
		
	}

}
