// Last updated: 23/04/2026, 00:05:22
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 1; i<=n; i++){
            ans[i] = ans[i>>1] + (i&1);
        }
        return ans;
    }
}