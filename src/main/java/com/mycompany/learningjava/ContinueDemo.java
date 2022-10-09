package com.mycompany.learningjava;/*
 * @created Fri / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */

import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
 /*       int i;
// print even numbers between 0 and 100
        for (i = 0; i <= 100; i++) {
            if ((i % 2) != 0) continue; // iterate
            System.out.println(i);
        }

        String[] nums = {"One", "Two", "Three", "Four", "Five", "Six", "Sev"};
        for(int k = 0; k < nums.length; k++) {
            if (nums[k++].length() % 3 ==0) continue;
            System.out.println(nums[k]);
            break;
        }*/

        Scanner console = new Scanner(System.in);

        int number = 246;
        int reverse = 0;

//        System.out.print("Enter the number ");
//        number = 1 ;//console.nextInt();
        int temp = 246;
        int remainder;

        while(temp>0)
        {
            remainder = temp % 10; //6
            System.out.println("remainder " + remainder);
            reverse = (reverse * 10) + remainder; //6
            System.out.println("reverse " + reverse);
            temp /= 10;
            System.out.println("temp " + temp);
            System.out.println();
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }
}

