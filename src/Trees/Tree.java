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



        void insert(int data){
            if(root == null){
                root = new Node(data);
            }
        }




    }

