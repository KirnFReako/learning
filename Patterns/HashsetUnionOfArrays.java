package Patterns;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetUnionOfArrays {
public static ArrayList<Integer> UnionArray(int[] a, int[] b){

    HashSet<Integer> set = new HashSet<>();

    for( int num : a){
        set.add(num);
    }
    for(int num : b){
        set.add(num);
    }

    return new ArrayList<>(set);
}
public static void main(String[] args) {
        int[] a = {1,3,2,2,5,3};
        int[] b = {3,2,2,1,5,2,8};

        ArrayList<Integer> result = UnionArray(a,b);
    System.out.println(result);
    }
}
