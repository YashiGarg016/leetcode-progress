// Last updated: 23/04/2026, 00:06:58
class Solution {
    public boolean canJump(int[] nums) {
        int maxInd = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxInd){
                return false;
            }
            maxInd = Math.max(maxInd, i + nums[i]);
        }
        return true;
    }
}