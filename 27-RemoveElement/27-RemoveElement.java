// Last updated: 23/04/2026, 00:07:16
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int x : nums){
            if(x != val){
                nums[k++] = x;
            }
        }
        return k;
    }
}