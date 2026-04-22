// Last updated: 23/04/2026, 00:05:07
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0, max = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                curr++;
                max = Math.max(curr, max);
            }
            else{
                curr = 0;
            }
        }
        return max;

    }
}