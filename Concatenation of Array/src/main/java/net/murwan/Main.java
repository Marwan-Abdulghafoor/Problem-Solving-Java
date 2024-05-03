package net.murwan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
