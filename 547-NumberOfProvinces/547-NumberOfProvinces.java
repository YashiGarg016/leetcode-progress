// Last updated: 23/04/2026, 00:04:58
class Solution {
    public int findCircleNum(int[][] isConnected) {
        Set<Integer> vis = new HashSet<>();
        int provinces = 0;

        for(int i = 0; i < isConnected.length; i++){
            if(!vis.contains(i)){
                dfs(i, isConnected, vis);
                provinces++;
            }
        }
        return provinces;
    }

    public void dfs(int city, int[][] isConnected, Set<Integer> vis){
        vis.add(city);
        for(int curr = 0; curr < isConnected[city].length; curr++){
            int conn = isConnected[city][curr];
            if(conn == 1 && !vis.contains(curr)){
                dfs(curr, isConnected, vis);
            }
        }
    }
}