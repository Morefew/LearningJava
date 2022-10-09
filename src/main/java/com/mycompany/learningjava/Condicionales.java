package com.mycompany.learningjava;

public class Condicionales {

    public static void main(String[] args) {
        int matemáticas = 5;
        int biología = 8;
        int química = 7;
        int promedio = 0;
        
        promedio = (matemáticas + biología + química)/3;
        if (promedio >= 6)
            System.out.println("El Alumno Aprobó con una calificación de " + promedio);
        else System.out.println("El Alumno Reprobó con una calificación de " + promedio);
    }
}