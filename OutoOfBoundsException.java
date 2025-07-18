
	package Exceptions;
import java.util.*;

public class OutoOfBoundsException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number of elements in the array");
			int n=sc.nextInt();
			int[]array=new int[n];
			System.out.println("Enter the elements of the array");
			for(int i=0;i<n;i++) {
				array[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array you want to access");
			int k=sc.nextInt();
			System.out.println("Elements at index"+k+":" + array[k]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bounds exception");
		}
		finally {
			System.out.println("Try catch block is exectued");
		}

	}

}
