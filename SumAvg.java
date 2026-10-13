public class SumAvg {
    public static void main(String[] args){
        int num[]={10,20,30,40};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        float avg=sum/num.length;
        System.out.println("Sum is:"+sum);
        System.out.println("Average is:"+avg);
    }
}
