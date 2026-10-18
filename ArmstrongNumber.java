import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:");
        int num=sc.nextInt();
        int sum=0,temp=num;
        int len=String.valueOf(num).length();
        while(num!=0){
            int rem=num%10;
            sum=sum+(int)Math.pow(rem,len);
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
