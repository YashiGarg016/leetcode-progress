// Last updated: 23/04/2026, 00:02:08
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long actSum = 0, sumSq = 0;
        int totalNo = n * n;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int num = grid[i][j];
                actSum += num;
                sumSq += (long) num * num;
            }
        }
        long expSum = (long) totalNo * (totalNo + 1)/2;
        long expSumSq = (long) totalNo * (totalNo + 1) * (2 * totalNo + 1)/6;

        long diff = actSum - expSum;
        long diffSq = sumSq - expSumSq;

        long rm = diffSq / diff;

        int r = (int) ((diff + rm)/2);
        int m = (int) (rm - r);

        return new int[]{r, m};
    }
}