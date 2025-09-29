package TypeCasting;

public class DemoExplicitTypeCasting {

    public static void main(String[] args) {

        double d1 = 100.0; //Initializing double value

        float d2 = (float) d1; // Explicit casting to float

        long d3 = (long) d2; // Explicit casting to long

        int d4 = (int)d1; // Explicit casting to int

        byte d5 = (byte)d4; // Explicit casting to byte

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }

}
