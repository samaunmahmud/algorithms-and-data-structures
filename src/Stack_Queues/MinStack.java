//package Stack_Queues;
///*
//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
//
//Implement the MinStack class:
//
//MinStack() initializes the stack object.
//void push(int value) pushes the element value onto the stack.
//void pop() removes the element on the top of the stack.
//int top() gets the top element of the stack.
//int getMin() retrieves the minimum element in the stack.
//You must implement a solution with O(1) time complexity for each function.
//
//
//
//Example 1:
//
//Input
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//Output
//[null,null,null,null,-3,null,0,-2]
//
//Explanation
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin(); // return -3
//minStack.pop();
//minStack.top();    // return 0
//minStack.getMin(); // return -2
//
//
//Constraints:
//
//-231 <= val <= 231 - 1
//Methods pop, top and getMin operations will always be called on non-empty stacks.
//At most 3 * 104 calls will be made to push, pop, top, and getMin.
// */
//import java.util.Stack;
//
//class MinStack {
//    // Each element in the stack is an array: [val, currentMin]
//    private Stack<int[]> minStack;
//
//    public MinStack() {
//        minStack = new Stack<>();
//    }
//
//    public void push(int value) {
//        if (minStack.isEmpty()) {
//            minStack.push(new int[]{value, value});
//        } else {
//            int currentMin = minStack.peek()[1];
//            int newMin = Math.min(value, currentMin);
//            minStack.push(new int[]{value, newMin});
//        }
//    }
//
//    public void pop() {
//        minStack.pop();
//    }
//
//    public int top() {
//        return minStack.peek()[0]; // 0 is the value
//    }
//
//    public int getMin() {
//        return minStack.peek()[1]; // 1 is the minimum
//    }
//}
//
//
//
//
////******************** Second Soultion  *****************
//
//
//
//
//import java.util.Stack;
//
//class MinStack {
//    // Helper class to store value and current minimum together
//    private static class Pair {
//        int val;
//        int min;
//
//        Pair(int val, int min) {
//            this.val = val;
//            this.min = min;
//        }
//    }
//
//    private Stack<Pair> minStack;
//
//    public MinStack() {
//        minStack = new Stack<>();
//    }
//
//    public void push(int value) {
//        if (minStack.isEmpty()) {
//            minStack.push(new Pair(value, value));
//        } else {
//            int currentMin = minStack.peek().min;
//            minStack.push(new Pair(value, Math.min(value, currentMin)));
//        }
//    }
//
//    public void pop() {
//        minStack.pop();
//    }
//
//    public int top() {
//        return minStack.peek().val;
//    }
//
//    public int getMin() {
//        return minStack.peek().min;
//    }
//}
//
//
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(value);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */