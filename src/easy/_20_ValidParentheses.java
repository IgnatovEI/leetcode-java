package easy;

import java.util.Stack;

public class _20_ValidParentheses {
    /**
     * 20. Valid Parentheses
     * An input string is valid if:
     *  1. Open brackets must be closed by the same type of brackets.
     *  2. Open brackets must be closed in the correct order.
     *  3. Every close bracket has a corresponding open bracket of the same type.
     * @param s string containing just the characters '(', ')', '{', '}', '[' and ']'
     * @return true if s is valid
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
