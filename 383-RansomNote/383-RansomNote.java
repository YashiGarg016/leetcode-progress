// Last updated: 23/04/2026, 00:05:17
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        //make a counter for every single alphabet

         //count how many times the alphabet appears and it will the frequency at the index of that alphabet, like if "b" appears 3 times, it will store 3 at index 1.
        int[] alp_count = new int [26]; 
        for(char c: magazine.toCharArray()){
            alp_count[c - 'a']++;
        }

        //using the counter now, this for loop will check and reduce the array values evertime it encounters a same alphabet. if counter reaches 0, either we have exhausted that number or that alphabet does not exist in the 'magazine' string
        for(char c: ransomNote.toCharArray()){
            if(alp_count[c -'a'] == 0) return false;
            alp_count[c - 'a']--;
        }
        
        //return true if it survives all this
        return true;
        
    }
}