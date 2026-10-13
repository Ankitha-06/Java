public class ForEachLoop {
    public static void main(String[] args){
        int num[]={2,4,6,8,9,10};
        int sum=0;
        for(int a:num){
            sum=sum+a;
        }
        double avg=sum/num.length;
        System.out.println("SUM is:"+sum);
        System.out.println("AVERAGE is:"+avg);
    }
}
