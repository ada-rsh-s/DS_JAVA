class Solution {
    public int lengthOfLongestSubstring(String s) {
        int sLength = s.length();
        ArrayList<Character> longSub = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < sLength; i++) {

            for (int j = i; j < sLength; j++) {
                if (longSub.contains(s.charAt(j))) 
                    break;
                 else 
                    longSub.add(s.charAt(j));
            }
            System.out.println(longSub);
            if (count<longSub.size() )
                count = longSub.size();
            longSub.clear();
        }


        return count;
    }
}