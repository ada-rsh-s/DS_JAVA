import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {

        ArrayList<String> result = new ArrayList<>();

        int numsLength = nums.length;

        if(numsLength==0) return result;

        int start = nums[0];

        for (int i = 1; i <=numsLength; i++) {
            if (i == numsLength || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i - 1]);
                }
                if (i < numsLength) {
                    start = nums[i];
                }
            }
        }

        return result;
    }
}
