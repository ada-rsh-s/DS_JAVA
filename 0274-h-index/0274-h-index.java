import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        int hindex = 0;

        for (int i = 0; i < length; i++) {
            int h = length - i;
            if (citations[i] >= h) {
                hindex = h;
                break;
            }
        }

        return hindex;
    }
}
