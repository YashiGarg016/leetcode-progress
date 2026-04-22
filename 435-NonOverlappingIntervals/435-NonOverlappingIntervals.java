// Last updated: 23/04/2026, 00:05:13
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 1;
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int prev = 0;

        for(int i = 1; i < n; i++){
            if(intervals[i][0] >= intervals[prev][1]){
                prev = i;
                count++;

            }
        }
        return n - count;
    }
}