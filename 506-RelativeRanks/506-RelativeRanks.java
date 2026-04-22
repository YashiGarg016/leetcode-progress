// Last updated: 23/04/2026, 00:05:01
import java.util.Arrays;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Step 1: Create array of [score, index] pairs
        int[][] scoreWithIndex = new int[n][2];
        for (int i = 0; i < n; i++) {
            scoreWithIndex[i][0] = score[i];
            scoreWithIndex[i][1] = i;
        }

        // Step 2: Sort in descending order by score
        Arrays.sort(scoreWithIndex, (a, b) -> b[0] - a[0]);

        // Step 3: Assign ranks
        for (int i = 0; i < n; i++) {
            int idx = scoreWithIndex[i][1];
            if (i == 0) {
                result[idx] = "Gold Medal";
            } else if (i == 1) {
                result[idx] = "Silver Medal";
            } else if (i == 2) {
                result[idx] = "Bronze Medal";
            } else {
                result[idx] = String.valueOf(i + 1);
            }
        }

        return result;
    }
}