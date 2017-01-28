package com.finnerjones.jdk8.mooc.lesson1;

import java.util.Comparator;
import java.util.List;

/**
 * Created by finner on 28/1/17.
 */
public class StudentMaxScoreLambda {

    private List<Student> students;

    public StudentMaxScoreLambda(List<Student> s) {
        students = s;
    }

    public double maxScore() {
        double highestScore = students
            .stream()
            .filter(s -> s.getGradYear() == 2011)
            .map(s -> s.getScore())
            .max(Comparator.comparing(score -> score))
            .get();
        return highestScore;
    }

}
