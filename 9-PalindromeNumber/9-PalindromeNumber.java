// Last updated: 23/04/2026, 00:07:30
class Solution {
    public boolean isPalindrome(int x) {
       int sum = 0, r;
	 int temp = x;    
     while(x>0)
	   {    
        r = x % 10;   
        sum = (sum*10)+r;    
        x = x/10;    
       }    
      if(temp==sum)    
        return(true);    
      else    
       return(false);   
     }  
    }
