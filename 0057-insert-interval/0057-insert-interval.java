class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;

        // Step 1: Create a list with all intervals + the newInterval
        List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);

        // Step 2: Sort all intervals by start time
        intervalList.sort((a, b) -> a[0] - b[0]);

        // Step 3: Merge intervals
        List<int[]> merged = new ArrayList<>();
        merged.add(intervalList.get(0));
        int index = 0;

        for (int i = 1; i < intervalList.size(); i++) {
            int[] last = merged.get(index);
            int[] current = intervalList.get(i);

            if (last[1] < current[0]) {
                merged.add(current);
                index++;
            } else {
                last[1] = Math.max(last[1], current[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
