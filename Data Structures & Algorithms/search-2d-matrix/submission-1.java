class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int value = binarySearch(ints, target);
            if (value != -1) {
                return true;
            }
        }
        return false;
    }

    private int binarySearch(int[] array, int target) {
        int l = 0;
        int r = array.length - 1;

        while (l <= r) {
            int mid = l + ((r - l) / 2);
            int vv = array[mid];
            if (vv == target) {
                return mid;
            } else if (vv < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
