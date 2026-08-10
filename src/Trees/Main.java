package Trees;

public class Main {

    public static void main(String[] args) {





//
//        System.out.println(factorial(5));


        Tree tree = new Tree();

        tree.insert(2);
        tree.insert(7);
        tree.insert(3);
        tree.insert(9);
        tree.insert(1);
        tree.insert(43);
        tree.insert(32);
        tree.insert(11);
        tree.insert(17);
        tree.insert(6);
        tree.insert(9);

        tree.traversePreOrder();





    }



//    private static int  factorial(int n){
//        if(n==0){
//            return 1;
//        }
//
//        return n* factorial(n-1);
//    }



}
