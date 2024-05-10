package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,4,5,6,7};
        System.out.println(summaryRanges(arr));
    }


    public static List<String> summaryRanges(int[] nums) {

        ArrayList<String> list = new ArrayList<>();
        if (nums.length == 0){
            return list;
        }
        int start = nums[0];
        Integer end= null;
        int cur = nums[0]+1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == cur){
                end = cur;
                cur++;
            }else {
                String s;
                if (end==null){
                    s = String.valueOf(start);
                }else{
                    s = start + "->" + end;
                }
                list.add(s);
                start = nums[i];
                end = null;
                cur = nums[i]+1;
            }
        }
        String s;
        if (end == null){
            s = String.valueOf(start);
        }else{
            s = start + "->" + end;
        }
        list.add(s);

        return list;

    }
}