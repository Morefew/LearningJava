package com.mycompany.learningjava;/*
 * @created Sun / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */

public class ArrayTest {
    public static void main(String[] args) {
        int[] sampleArray = new int[10];
        int i;

        for (i = 0; i < 10; i++)
            sampleArray[i] = i;
        for (i = 0; i < 10; i++)
            System.out.println("This is sample[" + i + "]:" + sampleArray[i]);
    }
}
