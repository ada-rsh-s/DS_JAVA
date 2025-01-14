class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder finalString = new StringBuilder();
        boolean space = false;
        s = s.trim();  // Remove leading and trailing spaces
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));  // Build the current word
                space = true;
            } else {
                if (space) {
                    finalString.insert(0, " " + word.toString());  // Prepend the word to finalString
                    word.setLength(0);  // Reset the word
                    space = false;
                }
            }
        }

        // Add the last word (if any)
        finalString.insert(0, word.toString());

        return finalString.toString();
    }
}
