// Last updated: 23/04/2026, 00:07:09
class Solution {
  public int trap(int[] height) {
    if (height.length == 0)
      return 0;

    int ans = 0;
    int l = 0;
    int r = height.length - 1;
    int maxL = height[l];
    int maxR = height[r];

    while (l < r)
      if (maxL < maxR) {
        ans += maxL - height[l]; //totals the units of water
        maxL = Math.max(maxL, height[++l]); //left boundary updation
      } else {
        ans += maxR - height[r];
        maxR = Math.max(maxR, height[--r]); //right boundary updation
      }

    return ans;
  }
}