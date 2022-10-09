package com.mycompany.learningjava;

public class Operadores {
    public static void main(String args[]) {
        int numOne = 4;
        int numTwo = 4;
        int result = 0;
        
        result = numOne * numTwo + 2;
        System.out.println("El resultado es " + result);

        result = numOne + numTwo / 2;
        System.out.println("El resultado es " + result);
     
        result = (numOne + numTwo) / 2;
        System.out.println("El resultado es " + result);
        
        result = 9 + result;
        System.out.println("El resultado es " + result);
    }
}
