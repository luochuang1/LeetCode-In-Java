public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        if (matrix[0] == null || matrix[0].length == 0)
            return false;
        int row = matrix.length, column = matrix[0].length;
        int start = 0, end = row * column - 1;
        int mid = 0;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            int number = matrix[mid / column][mid % column]; // this is how to find a mid num of a 2D matrix
            if (number == target) {
                return true;
            } else if (number < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (matrix[start / column][start % column] == target) {
            return true;
        } else if (matrix[end / column][end % column] == target) {
            return true;
        }

        return false;
    }
