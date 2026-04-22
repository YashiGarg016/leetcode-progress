// Last updated: 23/04/2026, 00:07:21

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '[' || current == '{' || current == '(') {
                stack.push(current);
            } else {
                // Check if the stack is empty before peeking
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((top == '[' && current == ']') || 
                    (top == '{' && current == '}') || 
                    (top == '(' && current == ')')) {
                    stack.pop();
                } else {
                    return false; // Unmatched closing bracket
                }
            }
        }
        return stack.isEmpty(); // Stack should be empty if valid
    }
}
