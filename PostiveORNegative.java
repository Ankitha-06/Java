import java.util.*;
public class PostiveORNegative {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Postive");
        }
        if(num==0){
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Negative");
        }
    }
    
}
