// Last updated: 23/04/2026, 00:06:14
class Solution {
    public int maxProduct(int[] nums) {
        int l = 1, r = 1;
        int ans = nums[0];

        for(int i = 0; i < nums.length; i++){
            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;

            l *= nums[i];
            r *= nums[nums.length - 1 - i];

            ans = Math.max(ans, Math.max(l, r));
        }

        return ans;

        
    }
}