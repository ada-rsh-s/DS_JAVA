import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int sLength = s.length();
        int wordsCount = words.length;
        int wordLength = words[0].length();
        int totalWordLength = wordLength * wordsCount;

        List<Integer> startIndices = new ArrayList<>();

        if (sLength < totalWordLength) return startIndices;

        // Build the word frequency map
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        // Slide the window
        for (int i = 0; i < wordLength; i++) {
            int left = i, right = i;
            Map<String, Integer> currWordFreq = new HashMap<>();
            int count = 0;

            while (right + wordLength <= sLength) {
                // Get the next word
                String word = s.substring(right, right + wordLength);
                right += wordLength;

                // Check if it's a valid word
                if (wordFreq.containsKey(word)) {
                    currWordFreq.put(word, currWordFreq.getOrDefault(word, 0) + 1);
                    count++;

                    // Shrink window if word count exceeds allowed frequency
                    while (currWordFreq.get(word) > wordFreq.get(word)) {
                        String leftWord = s.substring(left, left + wordLength);
                        currWordFreq.put(leftWord, currWordFreq.get(leftWord) - 1);
                        left += wordLength;
                        count--;
                    }

                    // Check for a valid concatenation
                    if (count == wordsCount) {
                        startIndices.add(left);
                    }
                } else {
                    // Reset the window if invalid word found
                    currWordFreq.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return startIndices;
    }
}
