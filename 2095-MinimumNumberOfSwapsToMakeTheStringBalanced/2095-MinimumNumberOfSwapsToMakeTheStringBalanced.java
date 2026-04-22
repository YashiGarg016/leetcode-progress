// Last updated: 23/04/2026, 00:02:51
class Solution {
  public int minSwaps(String s) {
    int unmatched = 0;
    for (final char c : s.toCharArray())
      if (c == '[')
        ++unmatched;
      else if (unmatched > 0) 
        --unmatched;

    return (unmatched + 1) / 2;
  }
}