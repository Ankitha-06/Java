import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle:");
        float P=sc.nextFloat();
        System.out.println("Enter time:");
        int T=sc.nextInt();
        System.out.println("Enter Rate:");
        float R=sc.nextFloat();
        float SI=(P*T*R)/100;
        System.out.println("Simple interest:"+SI);
    }
}
