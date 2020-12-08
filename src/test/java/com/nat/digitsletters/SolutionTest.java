package com.nat.digitsletters;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by long han on 2020/12/8 16:03
 */
public class SolutionTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void digitsLetters() {

        // 1、normal
        List<String> stringList = solution.digitsLetters(new int[]{2, 3});
        Assert.assertTrue(stringList.size() == 9);

        // 2、Nothing element
        stringList = solution.digitsLetters(new int[]{});
        Assert.assertTrue(stringList.size() == 0);

        // 3、one element
        stringList = solution.digitsLetters(new int[]{5});
        Assert.assertTrue(stringList.size() == 3);

        // 4、have a non mapping element
        stringList = solution.digitsLetters(new int[]{0, 6});
        Assert.assertTrue(stringList.size() == 3);

        // 5、flip case 4 order
        stringList = solution.digitsLetters(new int[]{6, 0});
        Assert.assertTrue(stringList.size() == 3);

        // 6、evil param
        stringList = solution.digitsLetters(new int[]{-1, 10});
        Assert.assertTrue(stringList.size() == 0);


    }
}