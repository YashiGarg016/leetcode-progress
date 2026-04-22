// Last updated: 23/04/2026, 00:03:32
class Solution {
    public int numberOfSubstrings(String s) {
        int lastSeen[] = {-1, -1, -1};
        int count = 0;
        int n = s.length();

        for(int i = 0; i< n; i++){
            lastSeen[s.charAt(i) - 'a'] = i; //storing the index of the character where it was last seen

            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                count += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
            }
        }
        return count;
    }
}