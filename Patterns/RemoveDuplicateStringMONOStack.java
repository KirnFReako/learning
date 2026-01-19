package Patterns;
import java.util.*;

public class RemoveDuplicateStringMONOStack {

public String remove(String s) {
    int[] freq = new int[26];
    boolean[] used = new boolean[26];

    for(char c: s.toCharArray()){
        freq[c-'a']++;
    }

    Stack<Character> stack = new Stack<>();

    for(char c : s.toCharArray()){
        int idx = c-'a';
        freq[idx]--;


        if(used[idx])continue;

        while(!stack.isEmpty()
                && stack.peek() > c
                && freq[stack.peek() - 'a']>0){//we can remove it if the
            used[stack.pop()-'a'] = false;
        }


        stack.push(c);
        used[idx] = true;


    }
    StringBuilder sb = new StringBuilder();
    for(char c : stack) {sb.append(c);}
    return sb.toString();
}
}