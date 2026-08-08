package Queue;

import java.util.ArrayList;

public class PriorityQueue {

    ArrayList<Integer> arr = new ArrayList<>();

    public void enqueue(int value){
        if(arr.isEmpty()){
            arr.add(value);
        }
        int i = arr.size()-1;

        while(i> -1){
            if(value<arr.get(i)){
                arr.add(i+1,arr.get(i));

            }else{
                arr.add(i+1,value);
                break;
            }
            i--;



        }



    }

    public void printArr(){
        int i =0;
        while (!arr.isEmpty()){
            System.out.println(arr.get(i));
            i++;
        }
    }


    public static void main(String[] args){
        var test = new PriorityQueue();
        test.enqueue(44);
        test.enqueue(22);
        test.enqueue(11);
        test.printArr();



    }



}
