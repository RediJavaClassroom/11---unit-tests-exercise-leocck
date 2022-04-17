package com.redi.j2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    }

    public int findHighestNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }
        int highest = numbers[0];
        for (int number : numbers) {
            highest = Math.max(highest, number);
        }
        return highest;
    }

    public boolean hasDuplicates(List<Integer> list) {
        if (list == null) return false;
        Set<Integer> set = new HashSet<>(list);
        return list.size() != set.size();
    }
}
