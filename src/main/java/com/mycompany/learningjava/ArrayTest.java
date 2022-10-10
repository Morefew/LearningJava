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
        int i, a, b, t;

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

        // Assignment of value from the generated array
        min = max = nums[0];

        System.out.println(min + " - " + max);

        for (int k = 1; k < 10; k++) {
            if (nums[k] < min) min = nums[k];
            if (nums[k] > max) max = nums[k];
        }
        System.out.println("minimum number of the array is: " + min + "\nmaximum number of the array is: " + max);

        for (a = 1; a < nums.length; a++)
            for (b = nums.length - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) { // if out of order
                    // exchange elements
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        // display sorted array
        System.out.print("Sorted array is:");
        for (int l = 0; l < nums.length; l++)
            System.out.print(" " + nums[l]);
        System.out.println();
    }


}
