// Last updated: 23/04/2026, 00:06:21
class Solution {
    // Trie node definition
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }
    
    // Root of Trie
    TrieNode root = new TrieNode();

    // Inserts word into Trie
    private void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isWord = true;
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        // Build the Trie
        for (String word : wordDict) insert(word);
        // Memoization map
        Map<Integer, Boolean> memo = new HashMap<>();
        // Start DFS
        return dfs(s, 0, memo);
    }
    
    private boolean dfs(String s, int start, Map<Integer, Boolean> memo) {
        if (start == s.length()) return true;
        if (memo.containsKey(start)) return memo.get(start);
        TrieNode node = root;
        for (int i = start; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            if (node.children[idx] == null) break;
            node = node.children[idx];
            if (node.isWord) {
                if (dfs(s, i + 1, memo)) {
                    memo.put(start, true);
                    return true;
                }
            }
        }
        memo.put(start, false);
        return false;
    }
}
