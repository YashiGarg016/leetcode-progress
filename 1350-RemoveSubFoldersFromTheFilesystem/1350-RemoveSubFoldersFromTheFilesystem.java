// Last updated: 23/04/2026, 00:03:40
class Solution {
  public List<String> removeSubfolders(String[] folder) {
    List<String> ans = new ArrayList<>();
    String prev = "";

    Arrays.sort(folder);

    for (final String f : folder) {
      if (!prev.isEmpty() && f.startsWith(prev) && f.charAt(prev.length()) == '/')
        continue;
      ans.add(f);
      prev = f;
    }

    return ans;
  }
}