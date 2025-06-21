import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Map;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> symMap = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
        );

        for (char c : s.toCharArray()) {
            if (symMap.containsValue(c)) {
                stack.push(c);
            } else if (symMap.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != symMap.get(c)) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
