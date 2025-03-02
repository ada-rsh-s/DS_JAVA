class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int sLength = s.length();
        int wordsLength = words.length;
        int singleWordLength = words[0].length();
        int totalWordLength = singleWordLength * wordsLength;

        Map<String, Integer> wordFreq = new HashMap<>();
        List<Integer> startIndices = new ArrayList<>();

        // Build the frequency map for words
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        // Iterate over every possible starting position
        for (int i = 0; i < singleWordLength; i++) {
            int left = i, right = i;
            Map<String, Integer> currWordFreq = new HashMap<>();
            int count = 0;

            // Slide the window over the string
            while (right + singleWordLength <= sLength) {
                String word = s.substring(right, right + singleWordLength);
                right += singleWordLength;

                // If the word is valid, add it to the current window
                if (wordFreq.containsKey(word)) {
                    currWordFreq.put(word, currWordFreq.getOrDefault(word, 0) + 1);
                    count++;

                    // Shrink the window if the frequency of the word exceeds the allowed frequency
                    while (currWordFreq.get(word) > wordFreq.get(word)) {
                        String leftWord = s.substring(left, left + singleWordLength);
                        currWordFreq.put(leftWord, currWordFreq.get(leftWord) - 1);
                        left += singleWordLength;
                        count--;
                    }

                    // If all words are found, record the starting index
                    if (count == wordsLength) {
                        startIndices.add(left);
                    }
                } else {
                    // Reset the window if an invalid word is found
                    currWordFreq.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return startIndices;
    }
}
