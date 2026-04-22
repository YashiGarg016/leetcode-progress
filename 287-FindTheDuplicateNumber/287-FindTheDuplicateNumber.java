// Last updated: 23/04/2026, 00:05:24
class Solution {
    public int findDuplicate(int[] nums) {
        int[] count = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
            if(count[nums[i]] > 1){
                return nums[i];
            }
        }

        return nums.length;
    }
}