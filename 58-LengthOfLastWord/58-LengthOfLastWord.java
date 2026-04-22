// Last updated: 23/04/2026, 00:06:55
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while(i>=0 && s.charAt(i)==' '){
            --i;
        }
        int j = i;
        while(j >= 0 && s.charAt(j) != ' '){
            --j;
        }
        return i-j;
    }
}