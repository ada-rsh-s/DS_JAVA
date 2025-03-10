class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int sLength = s.length();
        int wordsLength = words.length;
        int singleWordLength = words[0].length();
        int totalWordLength = singleWordLength * wordsLength;

        Map<String, Integer> wordFreq = new HashMap<>();
        List<Integer> startIndices = new ArrayList<>();

        if (sLength < totalWordLength) return startIndices;

        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);

        }

        for (int i = 0; i < singleWordLength; i++) {
            Map<String, Integer> currWordFreq = new HashMap<>();
            int left = i, right = i;
            int validWordCount=0;
            while (right <= sLength - singleWordLength) {
                String currWord = s.substring(right, right + singleWordLength);
                right+= singleWordLength;
                if (wordFreq.containsKey(currWord)) {
                    currWordFreq.put(currWord, currWordFreq.getOrDefault(currWord, 0) + 1);
                    validWordCount++;

                    while (currWordFreq.get(currWord) > wordFreq.get(currWord)) {
                        String remWord = s.substring(left, left + singleWordLength);
                         currWordFreq.put(remWord, currWordFreq.getOrDefault(remWord, 0) - 1);
                         validWordCount--;
                        left += singleWordLength;
                    }
                    if (validWordCount==wordsLength)
                        startIndices.add(left);
                } else {
                    currWordFreq = new HashMap<>();
                    left=right;
                    validWordCount=0;

                }
            }
        }
        return startIndices;

    
    }

}