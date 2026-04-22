// Last updated: 23/04/2026, 00:05:57
class Solution {
 public:
  int findKthLargest(vector<int>& nums, int k) {
    priority_queue<int, vector<int>, greater<>> minHeap;

    for (const int num : nums) {
      minHeap.push(num); //deleting all no.s which are larger than k, so that the largest element will be kth largest element.
      if (minHeap.size() > k)
        minHeap.pop();
    }

    return minHeap.top();
  }
};