class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        // Calculate the sum of elements in the array
        for (int num : nums) {
            actualSum += num;
        }
        
        // The missing number is the difference
        return expectedSum - actualSum;
    }
}