package String;
import java.util.*;

public class WordSubset {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxfreq = new int[26];
        ;

        for (String b : words2) {
            int[] freq = new int[26];

            for (char c : b.toCharArray()) {
                freq[c - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                maxfreq[i] = Math.max(maxfreq[i], freq[i]);
            }
        }

        List<String> result = new ArrayList<>();

        for (String a : words1) {
            int[] freq = new int[26];

            for (char c : a.toCharArray()) {
                freq[c - 'a']++;
            }

            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] < maxfreq[i]) {
                    isUniversal = false;
                    break;
                }

            }
            if (isUniversal) {
                result.add(a);
            }
        }

        return result;
    }
}
