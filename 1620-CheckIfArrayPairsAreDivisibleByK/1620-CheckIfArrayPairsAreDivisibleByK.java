// Last updated: 23/04/2026, 00:03:20
class Solution {
  public boolean canArrange(int[] arr, int k) {
    int[] count = new int[k];

    for (int a : arr) {
      a %= k;
      ++count[a < 0 ? a + k : a]; //checks incase of -ve no.s
    }

    if (count[0] % 2 != 0)
      return false; //for no.s which are div completely by k

    for (int i = 1; i <= k / 2; i++)
      if (count[i] != count[k - i]) //for the rest of the no.s
        return false;

    return true;
  }
}