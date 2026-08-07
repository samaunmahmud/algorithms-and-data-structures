package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args){
        Queue<Integer> q = new ArrayDeque<>();

        q.add(43);
        q.add(64);
        q.add(88);
        reverseQ(q);


    }


    public static void reverseQ(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.add(q.poll());

        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }

        System.out.println(q);

    }
}
