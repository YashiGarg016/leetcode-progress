// Last updated: 23/04/2026, 00:05:28
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray(); 
        if(s1.length != t1.length){
            return false;
        }

        for(char x : s1){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char x : t1){
            map.put(x, map.getOrDefault(x, 0) - 1);
        }

        for(int val : map.values()){
            if(val != 0) return false;
        }
        return true;

    }
}