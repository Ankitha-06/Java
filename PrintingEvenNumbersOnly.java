import java.util.Scanner;
public class PrintingEvenNumbersOnly {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(int i=2;i<=n;i=i+2){
            System.out.println("Even numbers only:"+i);
        }
    }
}
