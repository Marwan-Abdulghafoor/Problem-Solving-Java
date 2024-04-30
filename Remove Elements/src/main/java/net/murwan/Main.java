package net.murwan;

public class Main {
    public static void main(String[] args) {
    int[] nums = {3,2,2,3};
        System.out.println(removeElements(nums, 3));
        }

    static int removeElements(int[] nums, int val) {
        int temp = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] != val){
                nums[temp] = nums[i];
                temp++;
            }
        }
        return temp;
    }
}