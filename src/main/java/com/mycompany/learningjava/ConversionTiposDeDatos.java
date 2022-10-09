package com.mycompany.learningjava;

public class ConversionTiposDeDatos {
    public static void main(String[] args) {
        // EXPLICIT CASTING o NARROWING CONVERSION (from higher to lower precision)

        /* Nota: Al asignarle valor al tipo de byte,
        la parte fraccionaria se pierde
        y se reduce al módulo 256 (rango de byte).*/

        byte b;
        int i = 389;
        double d = 318.142;
        System.out.println("Conversion de int a byte.");

        //i%256
        b = (byte) i;
        System.out.println("i - 5 = " + (i - 5) + ", i + 5 = " + (i + 5) + "\n\ri = " + i + " b = " + b + "\n\rb - 5 = " + (b = (byte) (i - 5)) + ", b + 5 = " + (b = (byte) (i + 5)));
        System.out.println("\nConversion de double a byte.");

        //d%256
        b = (byte) d;
        System.out.println("d - 5.123 = " + (d - 5.123) + ", d + 5.123 = " + (d + 5.123) + "\n\ri = " + d + " b = " + b + "\n\rb - 5.123 = " + (b = (byte) (d - 5.123)) + ", b + 5.123 = " + (b = (byte) (d + 5.123)));


        // IMPLICIT CASTING o WIDENING CONVERSION ( from lower to higher precision) //
        System.out.println("\n\rConversion implícita de int a double");
        int w = 481;
        long x = w;
        float y = x;
        double z = y;
        double division = 845 / (float) 29 ; // operación de int ÷ float

        System.out.println("w = "+ w +
                "\n\rx = "+ x +
                "\n\ry = "+ y +
                "\n\rz = "+ z +
                "\n\rdivision = "+ division);
    }
}
