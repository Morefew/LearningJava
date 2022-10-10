package com.mycompany.learningjava;/*
 * @created Sun / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */

import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {

        // Array auto int entry
        int[] tenNumsArray = new int[10];
        int i;

        for (i = 0; i < tenNumsArray.length; i++)
            tenNumsArray[i] = i;
        for (i = 0; i < tenNumsArray.length; i++)
            System.out.println("This is sample[" + i + "]:" + tenNumsArray[i]);

        // Array auto random int entry
        int[] nums = new int[10];
        int min, max;
        Random numbersGenerator = new Random();

        for (int j = 0; j < nums.length; j++) {
            nums[j] = numbersGenerator.nextInt(100);
            System.out.println(nums[j]);
        }

        min = max = nums[0]; // Assignment of value from the generated array

        System.out.println(min + " - " + max);

        for (int k = 1; k < 10; k++) { //min and max value search
            if (nums[k] < min) min = nums[k];
            if (nums[k] > max) max = nums[k];
        }
        System.out.println("minimun number of the array is: " + min + "\nmaximun number of the array is: " + max);
    }


}
