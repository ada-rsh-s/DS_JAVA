class Solution {
    public int findMinArrowShots(int[][] points) {
        int length = points.length;
Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrows = 0,i=0;

        while (i < length) {
            int arrowPoint = points[i][1];
            arrows++;

            while (i<length && points[i][0] <= arrowPoint ) {
                i++;
            }

        }

            return arrows;

    }
}