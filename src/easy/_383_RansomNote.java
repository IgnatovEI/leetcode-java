package easy;

import java.util.HashMap;
import java.util.Map;

public class _383_RansomNote {
    /**
     * 383. Ransom Note
     * @param ransomNote string
     * @param magazine string
     * @return true if ransomNote can be constructed by using the letters
     * from magazine and false otherwise
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> m = new HashMap<>();
        boolean ans = false;

        for (char c : magazine.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (m.containsKey(c) && m.get(c) > 0) {
                m.put(c, m.getOrDefault(c, 0) - 1);
                ans = true;
            } else {
                ans = false;
                break;
            }
        }

        return ans;
    }
}
