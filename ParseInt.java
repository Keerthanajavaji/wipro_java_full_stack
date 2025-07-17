package exampleException;
import java.util.*;
public class ParseInt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter an integer:");
			String b=sc.nextLine();
			int a=Integer.parseInt(b);
			System.out.println("The square value is"+a*a);
		}
		catch(NumberFormatException e) {
			System.out.println("Enter input is not a valid format for an integer");
			
		}
		

	}

} {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter an integer:");
			String b=sc.nextLine();
			int a=Integer.parseInt(b);
			System.out.println("The square value is"+a*a);
		}
		catch(NumberFormatException e) {
			System.out.println("Enter input is not a valid format for an integer");
			
		}
		

	}

}
