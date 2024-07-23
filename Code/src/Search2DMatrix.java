// Search a 2D Matrix
// https://leetcode.com/problems/search-a-2d-matrix/description/
// Matrix [[1,3,5,7],[10,11,16,20],[23,30,34,60]] target 2
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; // Number of rows in the matrix
        int m = matrix[0].length; // Number of columns in the matrix
        int low = 0, high = n * m - 1; // Initializing the low and high pointers for binary search

        while (low <= high) {
            int mid = (low + high) / 2; // Finding the middle index
            int row = mid / m; // Calculating the row index of the middle element
            int col = mid % m; // Calculating the column index of the middle element
            if (matrix[row][col] == target) // If the middle element is the target, return true
            {
                return true;
            }
            else if (matrix[row][col] < target) // If the middle element is less than the target, move the low pointer
            {
                low = mid + 1;
            } else // If the middle element is greater than the target, move the high pointer
            {
                high = mid - 1;
            }
        }
        return false; // Return false if the target is not found
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] martrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 2;
        boolean searchMatrix = s.searchMatrix(martrix, target);
        System.out.println(searchMatrix);
    }
}
