package Patterns;

import java.util.PriorityQueue;

public class MinHeapKthElement {


     static int KthSmallest(int[] arr, int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for( int num : arr ){
            minheap.add(num);
        }
        for( int i =0; i<k-1;i++){
            minheap.poll();
        }
        return minheap.poll();
    }

    public static void main(String[] args) {
        int[] arr= {3,5,2,6,8,10};
        int k =3;



        System.out.println("the kth smallest no : " + KthSmallest(arr,k));
    }

}
