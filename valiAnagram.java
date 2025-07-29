import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class valiAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagram(strs)); // Print the result
    }

    public static List<List<String>> groupAnagram(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String s : strs) {
            String value = getFrequency(s);
            if (mp.containsKey(value)) {
                mp.get(value).add(s);
            } else {
                List<String> se = new ArrayList<>();
                se.add(s);
                mp.put(value, se);
            }
        }
        return new ArrayList<>(mp.values()); // Move return statement outside the loop
    }

    public static String getFrequency(String s) {
        int[] storeFrequency = new int[26];
        for (char c : s.toCharArray()) {
            int val = c - 'a'; // Correct the frequency calculation
            storeFrequency[val]++;
        }
        StringBuilder addElement = new StringBuilder();
        for (int i = 0; i < storeFrequency.length; i++) {
            if (storeFrequency[i] > 0) {
                addElement.append((char) ('a' + i)); // Append the character
                addElement.append(storeFrequency[i]); // Append its frequency
            }
        }
        return addElement.toString();
    }
}