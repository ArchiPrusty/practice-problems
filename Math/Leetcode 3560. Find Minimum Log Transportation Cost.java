/*You are given integers n, m, and k.

There are two logs of lengths n and m units, which need to be transported in three trucks where each truck can carry one log with length at most k units.

You may cut the logs into smaller pieces, where the cost of cutting a log of length x into logs of length len1 and len2 is cost = len1 * len2 such that len1 + len2 = x.

Return the minimum total cost to distribute the logs onto the trucks. If the logs don't need to be cut, the total cost is 0.

Example :
Input: n = 6, m = 5, k = 5
Output: 5

Explanation:
Cut the log with length 6 into logs with length 1 and 5, at a cost equal to 1 * 5 == 5. Now the three logs of length 1, 5, and 5 can fit in one truck each.*/


class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if (n == 0 || m == 0 || k == 0) 
            return 0;

        long ans = 0;

        if (m<=k && n<=k) 
            return 0;

        if (m>k) {
            ans += (long)(m-k)*k;
        }
        if (n>k) {
            ans += (long)(n-k)*k;
        }

        return ans;
    }
}
