import java.util.*;
public class UserInputMultiplicationOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a:");
        int a=sc.nextInt();
        System.out.println("Enter value for b:");
        int b=sc.nextInt();
        int Mul=a*b;
        System.out.println("Multiplication of two is:");
        System.out.println(Mul);
    }
    
}
