import java.util.*;
public class SwitchStatement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1:");
        int num1=sc.nextInt();
        System.out.print("Enter operator:");
        char operator=sc.next().charAt(0);
        System.out.print("Enter number2:");
        int num2=sc.nextInt();
        switch(operator){
            case '+':System.out.println("Sum is:"+(num1+num2));break;
            case '-':System.out.println("Sub is:"+(num1-num2));break;
            case '*':System.out.println("Mul is:"+(num1*num2));break;
            default:System.out.println("Invalid operator!");
        }
    } 
}
