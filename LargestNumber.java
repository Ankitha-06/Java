import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int large=(a>b)?a:b;
        System.out.println("Largest number is:"+large);
    }
}
