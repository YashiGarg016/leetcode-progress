// Last updated: 23/04/2026, 00:05:49
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        return Math.max(f(nums, 1, nums.length - 1), f(nums, 0, nums.length - 2));
    }

    public int f(int nums[], int start, int end){
        int prev2 = 0;
        int prev = 0;

        for(int i = start; i <= end; i++){
            int take = nums[i] + prev2;
            
            int noTake = prev;

            int curr = Math.max(take, noTake);

            prev2 = prev;
            prev = curr;
        }
        return prev;

    }
}

