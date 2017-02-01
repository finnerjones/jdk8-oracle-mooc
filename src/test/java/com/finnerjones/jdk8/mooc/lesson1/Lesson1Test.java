package com.finnerjones.jdk8.mooc.lesson1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by finner on 1/2/17.
 */
public class Lesson1Test {

    private Lesson1 l1;

    @Before
    public void init() {
        l1 = new Lesson1();
    }


    @Test
    public void exercise1() {
        Assert.assertEquals("Expecting abcdef", "abcdef", l1.exercise1());
    }


    @Test
    public void exercise2() {
        Assert.assertEquals("Expecting list of 1 elements", 1, l1.exercise2().size());
        Assert.assertEquals("1st element is echo", "echo", l1.exercise2().get(0));
    }
}

