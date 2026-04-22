// Last updated: 23/04/2026, 00:04:34
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startclr = image[sr][sc];
        if(startclr == color) return image;

        dfs(image, sr, sc, startclr, color);
        return image;
    }

    private void dfs(int[][] image, int i, int j, int startclr, int color){
        if(i < 0 || j < 0 ||i >= image.length || j >= image[0].length || image[i][j] != startclr){
            return;
        }

        image[i][j] = color;

        dfs(image, i+1, j, startclr, color);
        dfs(image, i-1, j, startclr, color);
        dfs(image, i, j+1, startclr, color);
        dfs(image, i, j-1, startclr, color);
    }
}