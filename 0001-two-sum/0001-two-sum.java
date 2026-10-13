import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the number and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            // Add the current number and its index to the map
            numMap.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (though the problem guarantees one)
        return new int[] {};
    }
}