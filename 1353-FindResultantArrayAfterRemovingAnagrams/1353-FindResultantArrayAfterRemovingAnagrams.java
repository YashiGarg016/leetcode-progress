// Last updated: 23/04/2026, 00:03:39
class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        ans.add(words[0]);
        for(int i = 1; i < words.length; i++){
            char[] a = words[i].toCharArray(), b = ans.get(ans.size() - 1).toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(!Arrays.equals(a, b)){
                ans.add(words[i]);
            }

        }
        return ans;
    }
}