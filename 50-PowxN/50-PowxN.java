// Last updated: 23/04/2026, 00:07:02
class Solution {
    public double myPow(double x, int n) {
      return myPow1(x,(long)n);  
    }
    public double myPow1(double x, long n) {
        if(n==0)
         return 1;
        if(n<0)
         return myPow1(1/x,-n);
        if(n%2==0)
         return myPow1(x*x,n/2);
        return x*myPow1(x*x,(n-1)/2);    
    }
}