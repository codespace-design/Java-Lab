public class DataTypeDemo {
    public static void main(String[] args) {

        byte b = 100;
        short s = 20000;
        int i = 100;
        long l = 100000L;
        float f = 25.5f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        System.out.println("Byte value      : " + b);
        System.out.println("Short value     : " + s);
        System.out.println("Integer value   : " + i);
        System.out.println("Long value      : " + l);
        System.out.println("Float value     : " + f);
        System.out.println("Double value    : " + d);
        System.out.println("Character       : " + c);
        System.out.println("Boolean         : " + bool);

        System.out.println("\nMemory Range of Data Types:");
        System.out.println("byte    : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short   : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int     : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long    : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float   : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double  : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char    : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean : true or false");
    }
}