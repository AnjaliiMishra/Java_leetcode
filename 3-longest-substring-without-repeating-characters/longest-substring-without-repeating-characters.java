import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, move left pointer to the right
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set
            seen.add(currentChar);

            // Calculate the length of the current window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
