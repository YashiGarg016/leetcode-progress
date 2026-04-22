// Last updated: 23/04/2026, 00:05:48
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //TLE ho gya
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if(i == j){
        //             continue;
        //         }
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
         
        // }
        // return false;

        Set<Integer> numSet = new HashSet<>();

        for (int n : nums) {
            if (numSet.contains(n)) {
                return true;
            }
            numSet.add(n);
        }
        
        return false;        
    



    }
}