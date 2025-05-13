/*Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.


Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".*/


class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        String vowels = "aeiouAEIOU";
 
        while (i < j) {
            // Find left vowel
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            // Find right vowel
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }
             // Swap vowels
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}
