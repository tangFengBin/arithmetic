package com.arithmetic.code.arrays;

public class ArraysItemRepeat {
    public boolean containsDuplicate(int[] nums) {
        int[] sum = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n = nums[i]%nums.length;
            if(n<0) n+=nums.length;
            sum[n]++;
            if(sum[n]>1)
                for(int j=0;j<i;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
        }
        return false;
    }
}
