// Last updated: 23/04/2026, 00:05:39
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & n-1) == 0;
    }
}