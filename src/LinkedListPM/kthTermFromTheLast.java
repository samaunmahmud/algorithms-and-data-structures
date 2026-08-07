package LinkedListPM;

public class kthTermFromTheLast {
    LinkedList list = new LinkedList();

    Node previous;
    Node current;
    current = previous = first;

    int c=0;




    public int kthTerm(int k){

        while(current.next!=null){
            if(c>=k){
                current = current.next;
                previous = previous.next;
            }


        }



    }


}
