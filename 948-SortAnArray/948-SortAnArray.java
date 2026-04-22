// Last updated: 23/04/2026, 00:04:16
class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums, 0, nums.length -1);
       return nums; 
    }

    public void mergeSort(int[] array, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (high + low)/2;
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);
        merge(array, low, high, mid); 
    }

    public void merge(int[] array, int low, int high, int mid){
        int n1 = mid - low +1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        System.arraycopy(array, low, left, 0, n1);
        System.arraycopy(array, mid+1, right, 0, n2);

        int p1=0, p2 =0, idx = low;
        while(p1<n1 && p2<n2){
            if(left[p1] <= right[p2]){
                array[idx++] = left[p1++];
            }else{
                array[idx++] = right[p2++];
            }
        }
        while(p1<n1){
            array[idx++] = left[p1++];
        }

        while(p2<n2){
            array[idx++] = right[p2++];
        }
    }
}