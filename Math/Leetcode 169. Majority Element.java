/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

BOOYER-MOORE Voting selector algorithm*/



class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 1;
        for(int i =1; i<nums.length; i++){
            if(count == 0){
                count++;
                majority = nums[i];
            }
            else if(majority == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return majority;
    }
}
