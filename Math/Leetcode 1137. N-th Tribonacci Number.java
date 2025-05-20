/*The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.*/


class Solution {
    public int tribonacci(int n) {
        int first = 0;
        int second = 1;
        int third = 1;
        if( n == 0){
            return 0;
        }
        for(int i = 1; i<=n ; i++){
            int trib = first + second + third;
            first = second;
            second = third;
            third = trib;
        }
        return first;
    }
}
