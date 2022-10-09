package com.mycompany.learningjava;/*
 * @created Sat / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */

public class Vehicle {
    int passengers; // number of passengers
    int fuelcap;    // fuel capacity in gallons
    int mpg;        // fuel consumption in miles per gallon

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return fuelcap * mpg;
    }

    double fuelNeeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

//        minivan.passengers = 7;
//        minivan.fuelcap = 16;
//        minivan.mpg = 21;
        int minivanRange = minivan.range();

//        sportscar.passengers = 2;
//        sportscar.fuelcap = 14;
//        sportscar.mpg = 12;
        int sportscarRange = sportscar.range();

        double minivanGallons = minivan.fuelNeeded(dist);
        double sportscarGallons = sportscar.fuelNeeded(dist);

        System.out.println("Minivan can carry " + minivan.passengers + " passengers, for a range of " + minivanRange + " miles");
        System.out.println("Sportscar can carry " + sportscar.passengers + " passengers, for a range of " + sportscarRange + " miles");

        System.out.println("To go " + dist + " miles minivan needs " +
                minivanGallons + " gallons of fuel.");
        System.out.println("To go " + dist + " miles sportscar needs " +
                sportscarGallons + " gallons of fuel.");

        if (minivanRange > sportscarRange) {
            System.out.println("True");
        } else System.out.println("False");


    }
}
