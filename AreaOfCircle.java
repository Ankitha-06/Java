import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of a circle:");
        float r=sc.nextFloat();
        float A=3.14f*r*r;
        System.out.println(A);
    }
}
