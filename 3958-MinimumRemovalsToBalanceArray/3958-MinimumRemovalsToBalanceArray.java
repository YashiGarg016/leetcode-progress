// Last updated: 23/04/2026, 00:02:02
// class Solution {
//     public int minRemoval(int[] nums, int k) {
//         int n = nums.length;
//         int count = 0;
//         if(n == 1) return count;
//         Arrays.sort(nums);
//         for(int i = n - 1;i > 0; i--){
//             if(nums[i] % nums[0] == 0){
//                 int q = nums[i] / nums[0];
//                 if( q <= k){
//                     return count;
//                 }else{
//                     count++;
//                 }
//             }
//         }
//         return count;
//         }
//     }

class Solution {

    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int ans = n;
        int right = 0;

        for (int left = 0; left < n; left++) {
            while (right < n && nums[right] <= (long) nums[left] * k) {
                right++;
            }
            ans = Math.min(ans, n - (right - left));
        }

        return ans;
    }
}
