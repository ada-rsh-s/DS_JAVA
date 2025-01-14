class Solution {
    public String reverseWords(String s) {
        String word = "", finalstring = "";
        boolean space = false;
        s=s.trim();
        int length = s.length();

        for (int i = 0; i < length ; i++) {
            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
                space = true;

            } else {
                if (space) {
                    finalstring = " "+word + finalstring;
                    word = "";
                    space=false;
                }
            }

        }
         finalstring = word + finalstring;

        return finalstring;
    }
}