import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int f=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=s.charAt(s.length()-i-1)){
                f++;
                break;
            }
        }
        if(f==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
