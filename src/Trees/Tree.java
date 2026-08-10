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
         var node = new Node(data);
            if(root == null){
                root = node;
                return;
            }


            var current  = root;
            while(true){
                if(data <current.data){
                    if(current.leftChild == null){
                        current.leftChild = node;
                        break;
                    }
                    current = current.leftChild;
                }else if(data > current.data){
                    if(current.rightChild == null){
                        current.rightChild = node;
                        break;
                    }
                    current = current.rightChild;
                }else{
                    break;
                }

            }

        }

        public boolean find(int data){

            var current = root;
            while(true){

                if(current == null){
                    return false;

                }
                if(data == current.data){
                    return true;
                }else if(data < current.data){
                    current = current.leftChild;
                }else{
                    current = current.rightChild;
                }
            }
        }






    }

