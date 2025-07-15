import java.util.*;
class Box{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Box myBox=new Box();
        int width=sc.nextInt();
        int depth=sc.nextInt();
        int height=sc.nextInt();
        myBox.volume(width,height,depth);
    }
    public void volume(int width,int height,int depth){
        System.out.println(width*height*depth);
    } 
    }