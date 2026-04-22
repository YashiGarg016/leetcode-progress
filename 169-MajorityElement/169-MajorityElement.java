// Last updated: 23/04/2026, 00:06:08
class Solution {
    public int majorityElement(int[] nums) {
        int votes = 0;
        int major = -1;
        for(int i = 0; i<nums.length; i++){
            if(votes == 0) major = nums[i];
            if(nums[i] == major){
                votes++;
            }
            else votes--;
        }
        return major;
    }
}