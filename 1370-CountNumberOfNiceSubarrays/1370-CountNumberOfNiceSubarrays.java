// Last updated: 23/04/2026, 00:03:37
class Solution {
    public int helper(int[] nums, int k){
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;

        if(k < 0) return 0;

        while(r < nums.length){
            sum += (nums[r] % 2);
            while( sum > k){
                sum -= (nums[l] % 2);
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int c1 = helper(nums, k);
        int c2 = helper(nums, k - 1);

        int res = c1 - c2;

        return res;
    }
}