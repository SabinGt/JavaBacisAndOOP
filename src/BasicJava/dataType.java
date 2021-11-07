package BasicJava;

import org.w3c.dom.ls.LSOutput;

public class dataType {
    public static void main(String[] args) {
        /*
    Data Types:
    1. Primitive types: Integers, Floating-point number, characters
    2. Reference Types: Classes, Annotations, Interface, Enumerations, Array
     */
        byte b =1;
        short s = 2;
        long l = 4;
        char c ='a';;
        boolean bool = true;
        float f = 1.2F;
        double d = 1.3;

    /*
    Data conversion
    Small box can be put into big box
    so can int be fit into float
    Widening conversion
     */
        int i=3;
        float f1= i;

    /*
    narrowing conversion

     */
        double d1 = 10.5;
        int i4 = (int)d1;
        System.out.println(i4);



    }




}
