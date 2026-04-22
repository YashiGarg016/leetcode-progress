// Last updated: 23/04/2026, 00:02:20
class Solution {
 public:
  long long findScore(vector<int>& nums) {
    long long ans = 0;
    vector<pair<int, int>> numAndIndices; // To store (num, index)
    vector<bool> seen(nums.size(), false); // To track used indices

    // Step 1: Create pairs of (num, index)
    for (int i = 0; i < nums.size(); ++i) {
      numAndIndices.push_back({nums[i], i});
    }

    // Step 2: Sort by num (and by index if nums are equal)
    sort(numAndIndices.begin(), numAndIndices.end());

    // Step 3: Process the sorted numbers
    for (const auto& [num, i] : numAndIndices) {
      if (seen[i]) // Skip if already seen
        continue;

      // Mark this index and its neighbors as seen
      seen[i] = true;
      if (i > 0) seen[i - 1] = true;
      if (i + 1 < nums.size()) seen[i + 1] = true;

      // Add this number to the score
      ans += num;
    }

    return ans;
  }
};
