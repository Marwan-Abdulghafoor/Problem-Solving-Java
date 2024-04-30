package net.murwan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    static int removeDuplicates(int[] nums){
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i+1]){
                nums[temp] = nums[i+1];
                temp++;
            }
        }
        return temp;
    }
}