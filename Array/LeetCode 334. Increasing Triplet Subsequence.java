/*Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

  Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
*/


class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
            if(n<3){
            return false;
        }
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        //prefix
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            minimum = Math.min(minimum,nums[i]);
            prefix[i]=minimum;
        }
        //suffix
        int maximum = Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            maximum = Math.max(maximum,nums[i+1]);
            suffix[i]=maximum;
        }

        //main
        for(int i=1;i<n-1;i++){
            if(nums[i]>prefix[i]&&nums[i]<suffix[i]){
                return true;
            }
        }

        return false;
    }

}
