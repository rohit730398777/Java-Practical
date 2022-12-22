package strings;
import java.util.Scanner;
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter the string to convert to Uppercase:");
			String st=scanner.nextLine();
			String reversedSt=new StringBuffer(st).reverse().toString().toUpperCase();
              System.out.println("Reversed string in uppercase:"+ reversedSt);
		}
		
		
		

	}

}
