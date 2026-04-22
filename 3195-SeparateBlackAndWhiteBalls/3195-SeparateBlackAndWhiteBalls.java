// Last updated: 23/04/2026, 00:02:09
class Solution {
  public long minimumSteps(String s) {
    long ans = 0;
    int ones = 0;

    for (final char c : s.toCharArray())
      if (c == '1')
        ++ones;
      else // Move 1s to the front of the current '0'.
        ans += ones;

    return ans;
  }
}