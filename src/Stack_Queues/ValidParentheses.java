package Stack_Queues;


/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false



Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
import java.util.Stack;
public class ValidParentheses {



        public boolean isValid(String s) {
            // 1. Store Characters instead of Strings
            Stack<Character> st = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i); // Read character once for convenience

                // 2. Use single quotes for chars
                if (c == '(' || c == '{' || c == '[') {
                    st.push(c); // Use () for method call
                } else {
                    // 3. Check if the STACK is empty before peeking
                    if (st.isEmpty()) {
                        return false;
                    }

                    // 4. Compare char against char using single quotes
                    if ((st.peek() == '(' && c == ')') ||
                            (st.peek() == '{' && c == '}') ||
                            (st.peek() == '[' && c == ']')) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }

            // 5. Stack must be empty at the end for all brackets to be matched
            return st.isEmpty();
        }
    }

