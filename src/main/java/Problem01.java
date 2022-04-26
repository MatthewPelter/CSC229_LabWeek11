import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem01 {

    public static List<List<String>> sortAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> anagrams;
        anagrams = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!anagrams.containsKey(key)) anagrams.put(key, new ArrayList());
            anagrams.get(key).add(s);
        }
        return new ArrayList(anagrams.values());
    }
    
    // Time Complexity: O(N * HlogH)
    // Space compelxity: O(N*H)
    
    public static void main(String[] args) {
        String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(sortAnagrams(arr));
        
    }
}
