// Last updated: 23/04/2026, 00:13:17
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if(nums.length == 0) return 0;
4
5        int i = 1;
6        for(int j = 1; j < nums.length; j++){
7            if(nums[j] != nums[i - 1]){
8                nums[i] = nums[j];
9                i++;
10            }
11        }
12
13        return i;
14
15    }
16}