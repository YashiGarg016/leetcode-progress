// Last updated: 23/04/2026, 00:02:39
class Solution {
  // Similar to 253. Meeting Rooms II
  public int minGroups(int[][] intervals) {
    // Stores `right`s.
    Queue<Integer> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a, b));

    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    for (int[] interval : intervals) {
      // There's no overlap, so we can reuse the same group.
      if (!minHeap.isEmpty() && interval[0] > minHeap.peek())
        minHeap.poll();
      minHeap.offer(interval[1]);
    }

    return minHeap.size();
  }
}