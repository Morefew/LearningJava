package com.mycompany.learningjava;/*
 * @created Sun / Oct / 2022
 * @project LearningJava
 * @author Lenny Gonzalez
 */

public class Metodos {

    public int expectedMinutesInOven(){
        int expectedTime = 40;
        return expectedTime;
    }
    public int remainingMinutesInOven(int minutesInOven){
        int totalMins = expectedMinutesInOven();
        return (totalMins - minutesInOven);
    }
    public int preparationTimeInMinutes(int layers){
        int timePerLayer = 2;
        return (timePerLayer * layers);
    }
    public int totalTimeInMinutes(int layers, int minutesInOven){
    int preparation = preparationTimeInMinutes(layers);
        return (preparation + minutesInOven);
    }
}
