class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> anagram = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            anagram.put(sChar, anagram.getOrDefault(sChar, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char tChar = t.charAt(i);
            if (anagram.containsKey(tChar)) {
                anagram.put(tChar, anagram.get(tChar) - 1);
                if (anagram.get(tChar) == 0)
                    anagram.remove(tChar);
            } else {
                return false;
            }
        }

        if (anagram.isEmpty())
            return true;
        else
            return false;
    }

}