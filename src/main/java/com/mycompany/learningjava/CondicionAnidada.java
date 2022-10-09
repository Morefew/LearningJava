package com.mycompany.learningjava;

import java.util.Scanner;

public class CondicionAnidada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SISTEMA DE CÁLCULOS MATEMÁTICOS BÁSICOS \r\n");

//        Crear un control que solo permita la entrada de números //

        System.out.println("Introduzca el primer número");
        int num_uno = input.nextInt();
        System.out.println("Introduzca el segundo número");
        int num_dos = input.nextInt();
        int resultado;
        
        System.out.println("Introduzca el número de la operación a realizar: \r\n"
                + " 1 - para suma \r\n"
                + " 2 - para resta \r\n"
                + " 3 - para multiplicación \r\n"
                + " 4 - para división");
        int operacion = input.nextInt();
       
        switch (operacion) {
            case 1:
                resultado = num_uno + num_dos;
                System.out.println("Resultado de la suma es " + resultado);
                break;
            case 2:
                resultado = num_uno - num_dos;
                System.out.println("Resultado de la resta es " + resultado);
                break;
            case 3:
                resultado = num_uno * num_dos;
                System.out.println("Resultado de la multiplicación es " + resultado);
                break;
            case 4:
                resultado = num_uno / num_dos;
                System.out.println("Resultado de la división es " + resultado);
                break;
            default:
                System.out.println("El numero ingresado no es una operación valida \r\n"
                        + "VUELVA A INTENTAR");
                break;
        }
    }
}
