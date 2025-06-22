/*An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5.
Given an integer n, return true if n is an ugly number.

Example 1:
Input: n = 6
Output: true
Explanation: 6 = 2 × 3

Example 3:
Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.*/


class Solution {
    public boolean isUgly(int n) {
        while( n>0 ){
            if(n%2==0)
                n/=2;
            else if( n%3==0 )
                n/=3;
            else if( n%5==0 )
                n/=5;
            else
                break;
        }
        if (n == 1)
            return true;
        else
            return false;
    }
} 
