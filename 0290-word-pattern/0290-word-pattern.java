class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> charStr = new HashMap<>();
        HashMap<String, Character> strChar = new HashMap<>();

        String[] strArray = s.split(" ");
        if (strArray.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            char pChar = pattern.charAt(i);
            String str = strArray[i];

            if (charStr.containsKey(pChar)) {
                if (!charStr.get(pChar).equals(str))
                    return false;
            } else {
                charStr.put(pChar,str);
            }

            if (strChar.containsKey(str)) {
                if (strChar.get(str) != pChar)
                    return false;
            } else {
                strChar.put(str, pChar);
            }

        }
        return true;
    }
}