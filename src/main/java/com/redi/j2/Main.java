package com.redi.j2;

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
}
