// Last updated: 23/04/2026, 00:05:08
class Solution {
    public int findContentChildren(int[] g, int[] s) {
       int i = 0;
    Arrays.sort(g);
    Arrays.sort(s);

    for (final int cookie : s)
      if (i < g.length && g[i] <= cookie)
        i++;

    return i;     
    }
}