package com.nat.digitsletters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Convert the digits from 0 to 9 into letters
 * Created by long han on 2020/12/8 15:59
 */
public class Solution {

    Map<Integer, char[]> phoneMapping = new HashMap<>();

    {
        phoneMapping.put(0, new char[0]);
        phoneMapping.put(1, new char[0]);
        phoneMapping.put(2, new char[]{'a', 'b', 'c'});
        phoneMapping.put(3, new char[]{'d', 'e', 'f'});
        phoneMapping.put(4, new char[]{'g', 'h', 'i'});
        phoneMapping.put(5, new char[]{'j', 'k', 'l'});
        phoneMapping.put(6, new char[]{'m', 'n', 'o'});
        phoneMapping.put(7, new char[]{'p', 'q', 'r', 's'});
        phoneMapping.put(8, new char[]{'t', 'u', 'v'});
        phoneMapping.put(9, new char[]{'w', 'x', 'y', 'z'});
    }

    /**
     * Support converting the digits from 0 to 9 into letters
     *
     * @param ints Some nums
     * @return All possible letter
     */
    public List<String> digitsLetters(int[] ints) {

        List<String> stringList = new ArrayList<>();
        if (ints == null || ints.length == 0) {
            return stringList;
        }

        List<char[]> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            int num = ints[i];
            if (num > 9 || num < 0) {
                continue;
            }
            char[] chars = phoneMapping.get(num);
            if (chars.length > 0) {
                list.add(chars);
            }
        }

        if (list.isEmpty()) {
            return stringList;
        }

        stringList = combineLetter(list);
        return stringList;
    }

    /**
     * Combine Letter
     *
     * @param chars
     * @return
     */
    private List<String> combineLetter(List<char[]> chars) {

        char[] remove = chars.remove(0);
        List<String> list = new ArrayList<>();
        if (chars.size() == 0) {
            for (int i = 0; i < remove.length; i++) {
                list.add("" + remove[i]);
            }
            return list;
        }
        List<String> strings = combineLetter(chars);
        for (int i = 0; i < remove.length; i++) {
            for (int j = 0; j < strings.size(); j++) {
                list.add(remove[i] + strings.get(j));
            }
        }
        return list;
    }
}
