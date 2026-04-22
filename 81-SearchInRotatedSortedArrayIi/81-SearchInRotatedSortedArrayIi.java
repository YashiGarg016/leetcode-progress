// Last updated: 23/04/2026, 00:06:45
class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(nums[mid] ==  target) return true;
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }

            if(nums[low] <= nums[mid]){ //kya ye left half atleast sorted hai
                if(target  >= nums[low] && target <= nums[mid]){ //kya target milega
                    high = mid - 1; //yaha milega toh right half ko maaro goli
                }
                else{
                    low = mid + 1; //nhi milega toh left half ko maaro goli, kyuki right mai toh hoga hi phir
                }
            }
            else{ //agar left half sorted nhi hai toh right def hoga
                if(target > nums[mid] && target <= nums[high]){ //kya idhar target milega
                    low = mid + 1;// yaha milega toh left half ko maaro goli, ab right mai dhundhenge
                }
                else{
                    high = mid - 1;//nhi milega toh right half ko maaro goli, kyuki left mai toh hoga hi phir
                }
            }
        }
        return false;
    }
}