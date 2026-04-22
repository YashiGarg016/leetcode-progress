// Last updated: 23/04/2026, 00:05:21
class Solution {
    public boolean isPowerOfFour(int n) {
       if (n <= 0) return false;
        while(n%4 == 0){
            n /=4 ;

        }
        return n ==1;
}
}