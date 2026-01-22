package String;

public class IsomorphicString {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;

        int[] mapST = new int[256];
        int[] mapTS = new int[256];

        for(int i =0;i < s1.length();i++){
            char c1  = s1.charAt(i);
            char c2  = s2.charAt(i);

            if(mapST[c1] != mapTS[c2]){
                return false;
            }

            mapST[c1] =i+1;
            mapTS[c2]= i+1;
        }
        return true;
    }
}
