/*You are given an array of n strings strs, all of the same length.
The strings can be arranged such that there is one on each line, making a grid.
For example, strs = ["abc", "bce", "cae"] can be arranged as follows:
abc
bce
cae

You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted, while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
Return the number of columns that you will delete.

Example 1:
Input: strs = ["cba","daf","ghi"]
Output: 1
Explanation: The grid looks as follows:
  cba
  daf
  ghi
Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.*/



class Solution {
    public int minDeletionSize(String[] strs) {

        int rows = strs.length;
        int cols = strs[0].length();

        String joined = String.join("", strs);
        char[] arr = joined.toCharArray();

        int count = 0;

        for (int col = 0; col < cols; col++) {
            boolean delete = false;

            for (int row = 1; row < rows; row++) {
                int prevIndex = (row - 1) * cols + col;
                int currIndex = row * cols + col;

                if (arr[currIndex] < arr[prevIndex]) {
                    delete = true;
                    break;
                }
            }
            if (delete) count++;
        }
        return count;
    }
}
