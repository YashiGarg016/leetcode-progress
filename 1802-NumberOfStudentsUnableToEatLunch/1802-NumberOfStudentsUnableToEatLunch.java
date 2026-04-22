// Last updated: 23/04/2026, 00:03:05
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int [] counts = new int[2];
        for(int student : students) counts[student]++;

        int left = sandwiches.length;
        for(int sandwich : sandwiches){
            if(counts[sandwich] == 0) break;
            if(left-- == 0) break;
            counts[sandwich]--;
        }
        return left;
    }
}