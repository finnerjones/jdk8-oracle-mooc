package com.finnerjones.jdk8.mooc.lesson1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


/**
 * Created by finner on 28/1/17.
 */
public class StudentMaxScoreLambdaTest {

    @Test
    public void studentHasMaxScore() {
        Student s1 = new Student(2001, 80.0d);
        Student s2 = new Student(2001, 75.5d);
        Student s3 = new Student(2001, 57.0d);
        Student s4 = new Student(2011, 89.4d);
        Student s5 = new Student(2011, 78.9d);
        Student s6 = new Student(2011, 92.3d);
        Student s7 = new Student(2011, 87.6d);
        Student s8 = new Student(2011, 81.8d);
        Student s9 = new Student(2012, 89.0d);
        List<Student> students = Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8,s9);
        StudentMaxScoreLambda smax = new StudentMaxScoreLambda(students);
        Assert.assertTrue(smax.maxScore() == 92.3d);
    }
}
