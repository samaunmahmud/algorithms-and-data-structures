package Trees;

public class Tree {
    private class Node {
        int data;
        Node leftChild;
        Node rightChild;

        public Node(int data) {
            this.data = data;
        }
    }


    private Node root;


    void insert(int data) {
        var node = new Node(data);
        if (root == null) {
            root = node;
            return;
        }


        var current = root;
        while (true) {
            if (data < current.data) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else if (data > current.data) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            } else {
                break;
            }

        }

    }

    public boolean find(int data) {

        var current = root;
        while (current != null) {


            if (data == current.data) {
                return true;
            } else if (data < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return false;


    }


    public void traversePreOrder(){
        traversePreOrder(root);
    }


    private void traversePreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        traversePreOrder(node.leftChild);
        traversePreOrder(node.rightChild);
    }


    public void traverseInOrder(){
        traverseInOrder(root);
    }



    private void traverseInOrder(Node node){
        if(node == null){
            return;
        }
        traverseInOrder(node.leftChild);
        System.out.print(node.data+" ");
        traverseInOrder(node.rightChild);
    }


    public void traversePostOrder(){
        traversePostOrder(root);
    }

    private void traversePostOrder(Node node){

        traversePostOrder(node.leftChild);
        traversePostOrder(node.rightChild);
        System.out.print(node.data+" ");
    }




}

