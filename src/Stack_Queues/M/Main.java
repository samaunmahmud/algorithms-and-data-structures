package Stack_Queues.M;

import java.sql.SQLOutput;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();


        stack.push(30);
        stack.push(65);
        stack.push(22);

        System.out.println(stack);

        var store = stack.pop();
        System.out.println(stack);
        System.out.println(store);





    }
}
