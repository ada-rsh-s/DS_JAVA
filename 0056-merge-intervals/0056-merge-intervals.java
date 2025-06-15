class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> overlap = new ArrayList<>();
        int max = 0;
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        overlap.add(intervals[0]);

        for (int i = 1; i < n; i++) {
            if (overlap.get(max)[1] < intervals[i][0]) {
                overlap.add(intervals[i]);
                max++;
            } else {
                overlap.get(max)[1] = Math.max(overlap.get(max)[1], intervals[i][1]);
            }
        }
        return overlap.toArray(new int[overlap.size()][]);
    }
}