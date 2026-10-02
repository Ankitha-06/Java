import java.util.*;
public class ArithmeticOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("ADD:"+add);
        System.out.println("SUB:"+sub);
        System.out.println("MUL:"+mul);
        System.out.println("DIV:"+div);
        System.out.println("MOD:"+mod);
    }
}
