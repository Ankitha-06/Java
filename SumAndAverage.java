import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 3 numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int sum=n1+n2+n3;
        int average=sum/3;
        System.out.println("Sum of 3 numbers:"+sum);
        System.out.println("Average of 3 numbers:"+average);
    }
}
