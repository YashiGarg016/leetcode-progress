// Last updated: 23/04/2026, 00:04:08
class Solution {
    public int fib(int n) {
        int prev2 = 0;
        int prev = 1;
        if (n < 1) return 0;
        for(int i = 2; i <=  n;i++){
            int curr_i = prev + prev2;
            prev2 = prev;
            prev = curr_i;
        }
        return prev;
    }
}