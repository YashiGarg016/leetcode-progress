// Last updated: 23/04/2026, 00:05:18
class Solution {
    public int getSum(int a, int b) {
        int c;
        while(b != 0){
            c = (a&b);
            a = a ^ b;
            b = (c) << 1;
        }
        return a;
         
    }
}