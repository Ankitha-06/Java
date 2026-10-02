import java.util.Scanner;
public class SaddlePoint {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter number of rows:");
        rows=sc.nextInt();
        System.out.print("Enter number of columns:");
        cols=sc.nextInt();
        int[][] a=new int[rows][cols];
        System.out.println("Enter array elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean found=false;
        for(int i=0;i<rows;i++){
            int smallest=a[i][0];
            int col=0;
            for(int j=1;j<cols;j++){
                if(a[i][j]<smallest){
                    smallest=a[i][j];
                    col=j;
                }
            }
            boolean larCol=true;
            for(int k=0;k<rows;k++){
                if(a[k][col]>smallest){
                    larCol=false;
                    break;
                } 
            }
            if(larCol){
                System.out.println("Saddle point="+smallest);
                found=true;
            }
        }
        if(found==false){
            System.out.println("No saddle point found.");
        }
    }
    
}
