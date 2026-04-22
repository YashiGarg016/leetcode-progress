// Last updated: 23/04/2026, 00:06:49
class Solution {
    public void sortColors(int[] nums) {
        int c0 =0, c1 = 0, n = nums.length;
        for(int i = 0; i< n; i++){
            if(nums[i] == 0) c0++;
            if(nums[i] == 1) c1++;
        }

        for(int i = 0; i<n; i++){
            if(i < c0) nums[i] = 0;
            if(c0 <= i && i< c0 + c1) nums[i] = 1;
            if(i >= c0 + c1) nums[i] = 2;
        }

    }
}