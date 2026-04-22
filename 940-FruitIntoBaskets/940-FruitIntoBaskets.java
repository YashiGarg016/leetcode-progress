// Last updated: 23/04/2026, 00:04:18
class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int n = fruits.length;

        Map<Integer, Integer> map = new HashMap<>();

        while(r < n){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);

            if(map.size() > 2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l]) == 0) map.remove(fruits[l]);
                l++;
            }
            if(map.size() <= 2){
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
        return maxlen;

    }
}