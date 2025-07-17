package Example;
import java.util.*;
public class ExceptionhandlingEX {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value a:");
		try {
			int a=sc.nextInt();
			System.out.println(a);
		}
		catch(InputMismatchException e) {
			System.out.println("pass integer");
		}
		

	}

}
