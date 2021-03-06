package com.pranav;


// https://leetcode.com/problems/find-the-duplicate-number/

public class FindDuplicate {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;      // This gives the index number not the value
            if (nums[i] < nums.length && nums[i] != correct && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return nums[j];
            }
        }
        return -1;
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
