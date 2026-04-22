// Last updated: 23/04/2026, 00:04:14
class Solution {
    //helper function will calculate total number of subarrays where sum <= goal
    public int helper(int[] nums, int goal){
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        
        if(goal < 0) return 0;

        while(r < nums.length){
            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }
            count += r - l + 1;
            r++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count1 = helper(nums, goal);
        int count2 = helper(nums, goal - 1);

        int final_count = count1 - count2;

        return final_count;


    }
}