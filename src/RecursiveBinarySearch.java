public class RecursiveBinarySearch {

    // Searches for a target value in a sorted array using recursion
    public static int binarySearch(int[] array, int low, int high, int target) {

        // Base case: target was not found
        if (low > high) {
            return -1;
        }

        // Find the middle index of the current search area
        int mid = low + (high - low) / 2;

        // Base case: target was found
        if (array[mid] == target) {
            return mid;
        }

        // If the target is greater than the middle value,
        // search the right half of the array
        if (array[mid] < target) {
            return binarySearch(array, mid + 1, high, target);
        }

        // Otherwise, search the left half of the array
        return binarySearch(array, low, mid - 1, target);
    }
}