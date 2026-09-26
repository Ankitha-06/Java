public class TypeConversion {
    public static void main(String[] args){
        //Type conversion(Implicit)==lower to higher.
        int intVal=100;
        long longVal=intVal;
        float floatVal=longVal;
        double doubleVal=floatVal;
        System.out.println("Integer value:"+intVal);
        System.out.println("Automatically converted to long:"+longVal);
        System.out.println("Automatically converted to float:"+floatVal);
        System.out.println("Automatically converted to double:"+doubleVal);
        
    }
}
