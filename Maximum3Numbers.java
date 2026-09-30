import java.util.Scanner;
public class Maximum3Numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int large=(a>b)?a:b;
        large=(large>c)?large:c;
        System.out.println("Maximum number is:"+large);
        }
}
