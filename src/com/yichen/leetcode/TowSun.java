package com.yichen.leetcode;

import java.util.HashMap;

public class TowSun {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]) ,i};
            }else {
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};

    }

    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = new TowSun().twoSum(nums, target);
        System.out.println(ints.toString());


    }
}
