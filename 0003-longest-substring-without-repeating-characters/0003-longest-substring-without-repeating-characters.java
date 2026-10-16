class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        // Use an array to store the last seen index of each ASCII character
        int[] charIndex = new int[128]; 
        
        // Initialize all indices to -1
        java.util.Arrays.fill(charIndex, -1);
        
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // If the character was seen and is inside our current window, move the left pointer
            if (charIndex[c] >= left) {
                left = charIndex[c] + 1;
            }
            
            // Update the last seen index of the current character
            charIndex[c] = right;
            
            // Update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}