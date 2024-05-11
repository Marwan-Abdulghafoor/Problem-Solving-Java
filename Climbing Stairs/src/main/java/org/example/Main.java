package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int climbStairs(int n) {
        if (n == 1 || n == 2){
            return n;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}