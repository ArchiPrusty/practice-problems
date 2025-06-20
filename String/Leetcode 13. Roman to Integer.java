/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.*/


class Solution {
    public int romanToInt(String s) {
       int sum = 0;
       for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            char next = ((i+1)<s.length()) ? s.charAt(i+1):' ';
            if(current=='I' &&(next=='V' || next=='X')){
                sum-=1;
            }
            else if(current=='X' &&(next=='L' || next=='C')){
                sum-=10;
            }
            else if(current=='C' &&(next=='D' || next=='M')){
                sum-=100;
            }
            else{
                if(current=='I')
                    sum+=1;
                else if(current=='V')
                    sum+=5;
                else if(current=='X')
                    sum+=10;
                else if(current=='L')
                    sum+=50;
                else if(current=='C')
                    sum+=100;
                else if(current=='D')
                    sum+=500;
                else if(current=='M')
                    sum+=1000;
            }
        }
        return sum;
    }
}
