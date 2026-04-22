// Last updated: 23/04/2026, 00:03:26
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxSum = 0;
        int n = cardPoints.length;

        for(int i = 0; i <= k-1; i++){
            lsum += cardPoints[i];
        }
        maxSum = lsum;

        int ridx = n - 1;
        for(int i = k - 1; i >= 0; i--){
            lsum -= cardPoints[i];
            rsum +=cardPoints[ridx];
            ridx--;

            maxSum = Math.max(maxSum, lsum + rsum);
        }

        return maxSum;

         

    }
}