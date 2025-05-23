/*Alice and Bob take turns playing a game, with Alice starting first.

You are given a string num of even length consisting of digits and '?' characters. On each turn, a player will do the following if there is still at least one '?' in num:

Choose an index i where num[i] == '?'.
Replace num[i] with any digit between '0' and '9'.
The game ends when there are no more '?' characters in num.

For Bob to win, the sum of the digits in the first half of num must be equal to the sum of the digits in the second half. For Alice to win, the sums must not be equal.

For example, if the game ended with num = "243801", then Bob wins because 2+4+3 = 8+0+1. If the game ended with num = "243803", then Alice wins because 2+4+3 != 8+0+3.

Assuming Alice and Bob play optimally, return true if Alice will win and false if Bob will win.

 
Example 2:
Input: num = "5023"
Output: false
Explanation: There are no moves to be made.
The sum of the first half is equal to the sum of the second half: 5 + 0 = 2 + 3.*/


class Solution {
    public boolean sumGame(String num) {
        int leftSum = 0, rightSum = 0;
        int leftQue = 0, rightQue = 0;
        int n = num.length();

        for (int i = 0; i < n / 2; i++) {
            char ch = num.charAt(i);
            if (ch == '?') {
                leftQue++;
            } else {
                leftSum += ch - '0';
            }
        }
        for (int i = n / 2; i < n; i++) {
            char ch = num.charAt(i);
            if (ch == '?') {
                rightQue++;
            } else {
                rightSum += ch - '0';
            }
        }
        if((leftQue + rightQue)%2 !=0){
            return true;
        }
        int maxS = Math.max(leftSum , rightSum);
        int minS = Math.min(leftSum , rightSum);
        int maxQ = Math.max(leftQue , rightQue);
        int minQ = Math.min(leftQue , rightQue);

        if((leftQue>rightQue)&&(leftSum>rightSum) || (leftQue<rightQue)&&(leftSum<rightSum) ){
            return true;
        }

        else{
             int diffS = Math.abs(leftSum - rightSum);
             int diffQ = Math.abs(leftQue - rightQue);
             
             if((diffS*2) == (diffQ*9))
             {
                return false;
             }
              return true;
        } 
    }
}
