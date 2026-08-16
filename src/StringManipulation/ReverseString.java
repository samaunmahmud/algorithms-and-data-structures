package StringManipulation;

import java.util.Stack;

public class ReverseString {


    public String reverseString(String s){
        Stack<Character> stack = new Stack<>();
        if(s == null){
            return "";
        }

        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        StringBuilder st = new StringBuilder();
        while(!stack.isEmpty()){
            st.append(stack.pop());
        }
        return st.toString();


    }

}
