class Solution {
    public String minWindow(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int matches = 0, minStart = 0, minLength = Integer.MAX_VALUE;

        Map<Character, Integer> tChars = new HashMap<>();
        Map<Character, Integer> currTChars = new HashMap<>();

        for (int i = 0; i < tLength; i++) {
            tChars.put(t.charAt(i), tChars.getOrDefault(t.charAt(i), 0) + 1);
        }

        int left = 0, right = 0;

        while (right < sLength) {
            char rightChar = s.charAt(right), leftChar = s.charAt(left);

            if (tChars.containsKey(rightChar)) {
                currTChars.put(rightChar, currTChars.getOrDefault(rightChar, 0) + 1);
                if (currTChars.get(rightChar).equals(tChars.get(rightChar))) {
                    matches++;
                }
            }
            while (matches == tChars.size()) {
                if (minLength > right - left + 1) {
                    minStart = left;
                    minLength = right - left + 1;
                }
                leftChar = s.charAt(left);
                if (tChars.containsKey(leftChar)) {
                    currTChars.put(leftChar, currTChars.get(leftChar) - 1);
                    if (currTChars.get(leftChar) < tChars.get(leftChar)) {

                        matches--;
                    }
                }
                left++;
            }

            right++;

        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);

    }
}