// Last updated: 23/04/2026, 00:05:10
class Solution {
    public int compress(char[] chars) {
        int idx = 0;

        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == ch){
                count++; i++;
            }
            if(count == 1){
                // chars[idx++] = ch;
                chars[idx] = ch;
                idx++;
            }
            else{
                // chars[idx++] = ch;
                chars[idx] = ch;
                idx++;
                String str = String.valueOf(count);
                for(char digit: str.toCharArray()){
                    // chars[idx++] = digit;
                    chars[idx] = digit;
                    idx++;
                }
            }
            i--;
        }
        return idx;
    }
}