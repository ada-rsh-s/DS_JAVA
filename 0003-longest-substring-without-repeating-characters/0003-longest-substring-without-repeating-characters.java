class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sLength = s.length();
        HashSet<Character> longSub = new HashSet<>();
        int count = 0, left = 0, right = 0;

        while (right < sLength) {
            while (longSub.contains(s.charAt(right))) {
                longSub.remove(s.charAt(left));
                left++;
            }
            longSub.add(s.charAt(right));

            count = Math.max(count, longSub.size());
            right++;
        }

        // for (int i = 0; i < sLength; i++) {

        // for (int j = i; j < sLength; j++) {
        // if (longSub.contains(s.charAt(j)))
        // break;
        // else
        // longSub.add(s.charAt(j));
        // }
        // count = Math.max(count,longSub.size());
        // longSub.clear();
        // }

        return count;
    }
}