package com.nat.digitsletters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;


/**
 * Created by long han on 2020/12/8 16:20
 */
public class SolutionPlusTest {

    SolutionPlus solutionPlus;

    @Before
    public void setUp() {
        solutionPlus = new SolutionPlus();

    }

    @Test
    public void digitsLettersPlus() {

        // 1、normal
        List<String> stringList = solutionPlus.digitsLettersPlus(new int[]{2, 3});
        Assert.assertTrue(stringList.size() == 9);

        // 2、single element more than 10
        stringList = solutionPlus.digitsLettersPlus(new int[]{23});
        Assert.assertTrue(stringList.size() == 9);

        // 3、two element and single more than 10
        stringList = solutionPlus.digitsLettersPlus(new int[]{23, 6});
        Assert.assertTrue(stringList.size() == 27);

        // 4、two element all more than 10
        stringList = solutionPlus.digitsLettersPlus(new int[]{23, 66});
        Assert.assertTrue(stringList.size() == 27 * 3);

        // 5、Nothing element
        stringList = solutionPlus.digitsLettersPlus(new int[]{});
        Assert.assertTrue(stringList.size() == 0);

        // 6、one element
        stringList = solutionPlus.digitsLettersPlus(new int[]{5});
        Assert.assertTrue(stringList.size() == 3);

        // 7、evil param
        stringList = solutionPlus.digitsLettersPlus(new int[]{-1, 100});
        Assert.assertTrue(stringList.size() == 0);

    }
}