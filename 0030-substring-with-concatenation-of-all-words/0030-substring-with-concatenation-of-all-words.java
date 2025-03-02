class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int sLength = s.length();
        int wordsLength = words.length;
        int singleWordLength = words[0].length();
        int totalWordLength = singleWordLength * wordsLength;

        Map<String, Integer> wordFreq = new HashMap<>();
        List<Integer> startIndices = new ArrayList<>();

        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= sLength - totalWordLength; i++) {
            Map<String, Integer> currWordFreq = new HashMap<>();

            String currString = s.substring(i, i + totalWordLength);

            for (int j = 0; j < totalWordLength; j += singleWordLength) {
                String currWord = currString.substring(j, j + singleWordLength);
                currWordFreq.put(currWord, currWordFreq.getOrDefault(currWord, 0) + 1);
            }
            if (currWordFreq.equals(wordFreq))
                startIndices.add(i);
        }
        return startIndices;
    }

}