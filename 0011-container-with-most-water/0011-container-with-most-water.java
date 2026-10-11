class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculate the area between the two pointers
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            
            // Update maximum area found so far
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}