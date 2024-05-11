package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else if (digits[i] == 9 && i != 0) {
                digits[i] = 0;
            } else {
                int[] ans = new int[digits.length + 1];
                Arrays.fill(ans, 0);
                ans[0] = 1;
                return ans;
            }
        }
        return digits;
    }
}