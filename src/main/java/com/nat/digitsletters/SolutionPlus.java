package com.nat.digitsletters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Support converting the digits from 0 to 99 into letters
 * Created by long han on 2020/12/8 16:13
 */
public class SolutionPlus extends Solution {

    /**
     * Support converting the digits from 0 to 99 into letters
     * @param ints Some nums
     * @return  All possible letter
     */
    public List<String> digitsLettersPlus(int[] ints) {

        if (ints == null || ints.length == 0) {
            return Collections.emptyList();
        }
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            int num = ints[i];
            if (num > 99 || num < 0) {
                continue;
            }

            while (num >= 10) {
                nums.add(num % 10);
                num /= 10;
            }
            nums.add(num);
        }

        int[] integers = nums.stream().mapToInt(Integer::valueOf).toArray();
        return super.digitsLetters(integers);
    }


}
