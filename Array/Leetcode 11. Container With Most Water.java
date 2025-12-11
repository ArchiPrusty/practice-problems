/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.*/


class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = Integer.MIN_VALUE;
        int i = 0; 
        int j = n-1; 
        int area = 0;
        while(i<j){
            area = Math.min(height[i],height[j])*(j-i);
            if(area > max){
                max = area;
            }
            if(height[i]<height[j])
            i++;
            else
            j--;
            area=0;
        }
        return max;
    }
}
