package Stack_Queues.M;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        Stack<Character> c = new Stack<>();
        String str = "ABCD";

        // Push all characters onto the stack
        for (int i = 0; i < str.length(); i++) {
            c.push(str.charAt(i));
        }

        // Create array matching the exact string size
        char[] arr = new char[str.length()];
        int j = 0;

        // Pop characters out in reverse order
        while (!c.isEmpty()) {
            arr[j] = c.pop();
            j++;
        }

        // Convert char array back to String or print directly
        System.out.println(new String(arr)); // Output: DCBA
    }
}