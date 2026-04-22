// Last updated: 23/04/2026, 00:05:59
class Solution {
    public int rob(int[] nums) {
        int prev2 = 0;
        int prev = nums[0];

        for(int i = 1; i < nums.length; i++){
            int take = nums[i];
            if(i > 1) take += prev2;
            int noTake = prev;

            int curr = Math.max(take, noTake);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}