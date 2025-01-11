class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int sum = romanValues.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if(romanValues.get(s.charAt(i))>=romanValues.get(s.charAt(i+1))){
                sum+=romanValues.get(s.charAt(i));
            }else{
                sum-=romanValues.get(s.charAt(i));
            }
                        
        }
        return sum;

    }
}