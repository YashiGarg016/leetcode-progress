// Last updated: 23/04/2026, 00:06:59
class Solution {
    public int maxSubArray(int[] nums) {
       int max = Integer.MIN_VALUE; // maximum sum
       int sum = 0;
       int n = nums.length;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}