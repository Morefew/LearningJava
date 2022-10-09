package com.mycompany.learningjava;/*
 * @created Thu / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */

import java.util.Random;

public class IfStatement {
    public static void main(String[] args)
            throws java.io.IOException {

        char ch;
        char answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char)System.in.read(); // get a char

        System.out.println("Your key is: " + ch);
        if (ch == answer) System.out.println("Your`re Right!!");
            else {
            System.out.print("...Sorry, you're");
            if (ch < answer) System.out.println(" too low");
            else System.out.println(" too high");
        }
    }

}

