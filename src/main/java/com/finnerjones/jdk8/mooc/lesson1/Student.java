package com.finnerjones.jdk8.mooc.lesson1;

/**
 * Created by finner on 28/1/17.
 */
public class Student {

    private int gradYear;
    private double score;

    public Student(int year, double score) {
        this.gradYear = year;
        this.score = score;
    }

    public int getGradYear() {
        return gradYear;
    }

    public double getScore() {
        return score;
    }

}
