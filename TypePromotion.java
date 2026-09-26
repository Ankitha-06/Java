public class TypePromotion {
    public static void main(String[] args){
        byte b=42;
        char c='N';
        float f=25.15f;
        int i=143;
        float result=(f*b)+(i/f)-(c-i);
        System.out.println("Final result is:"+result);

    }
}
