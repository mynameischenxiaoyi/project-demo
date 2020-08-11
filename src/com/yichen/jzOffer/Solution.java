package com.yichen.jzOffer;

import java.util.HashMap;

public class Solution {

    public int findRepeatNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap();
        for(int item :nums){
            if(hm.keySet().contains(item)){
                Integer integer = hm.get(item);
                hm.put(item,integer+1);
            }else {
                hm.put(item,0);
            }

        }
        int key=0;
        for (Integer item:hm.keySet()) {
            if(hm.get(item)>0){
                key =item;
                break;
            }
        }
        return key;

    }
    public static void main(String[] args){
        int[] a ={2, 3, 1, 0, 2, 5, 3};
        Solution s = new Solution();
        s.findRepeatNumber(a);

    }
}
