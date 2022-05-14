// Josh Technology Coding Problem Q2
// Question - https://drive.google.com/file/d/1HVTgGGfDaKXwahT8KmR5R_DH7lryEj9e/view?usp=sharing

package After_TEST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findDistinctReverse {
    public static void main(String[] args) {
        String[] words = {"abc", "cba", "qwe", "s", "sssll", "ewq"};
        System.out.println(uniqueReverseWord(words));
    }

    private static List<List<Integer>> uniqueReverseWord(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            hm.put(words[i], i);
        }
        for(int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            String reversedStr = sb.reverse().toString();
            if(hm.containsKey(reversedStr)) {
                int reversedStrIdx = hm.get(reversedStr);
                if(reversedStrIdx > i) {
                    List<Integer> indices = new ArrayList<>();
                    indices.add(i);
                    indices.add(reversedStrIdx);
                    ans.add(indices);
                }
            }
        }
        return ans;
    }
}
