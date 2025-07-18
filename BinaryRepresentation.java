package WrapperClass;

import java.util.Scanner;

public class BinaryRepresentation {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>255 || n<0) {
		throw new ArithmeticException("Enter the number in between 0 to 255");
        }
        else {
        	String binary=Integer.toBinaryString(n);
        	StringBuilder s=new StringBuilder(n);
        	
        	if(binary.length()<8) {
        		int l=8-binary.length();
        		for(int i=0;i<=(l-1);i++) {
        			s.append('0');
        		}
        		StringBuilder res=new StringBuilder(binary);
        		System.out.println(s.append(binary));
        	}
        	
        	
        	
        }
		

	}

}
