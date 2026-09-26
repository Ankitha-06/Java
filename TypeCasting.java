public class TypeCasting {
    public static void main(String[] args){
        double doubleVal=25.154579837;
        float castedFloat=(float)doubleVal;
        int castedInt=(int)castedFloat;
        byte castedByte=(byte)castedInt;
        short castedShort=(short)castedByte;
        System.out.println("Original Double value:"+doubleVal);
        System.out.println("Explicity casted to float:"+castedFloat);
        System.out.println("Explicity casted to int:"+castedInt);
        System.out.println("Explicity casted to byte:"+castedByte);
        System.out.println("Explicity casted to short:"+castedShort);
    }
}
