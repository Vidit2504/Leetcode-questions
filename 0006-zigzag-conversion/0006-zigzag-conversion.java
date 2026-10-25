class Solution {
    public String convert(String s, int numRows) {
        // Base case: if 1 row or numRows is greater than string length, no zigzag needed
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Create an array of StringBuilders for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currRow = 0;
        boolean goingDown = false;

        // Traverse the string and place characters in the correct row
        for (char c : s.toCharArray()) {
            rows[currRow].append(c);
            
            // Change direction when reaching the top or bottom row
            if (currRow == 0 || currRow == numRows - 1) {
                goingDown = !goingDown;
            }
            
            // Move up or down
            currRow += goingDown ? 1 : -1;
        }

        // Combine all rows into a single string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}