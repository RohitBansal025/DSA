package Arrays;
public class Linear_Search {
    // Optimized linear search method
    public static int linearSearch(int[] arr, int target) {
        // Check for empty array
        if (arr == null || arr.length == 0) {
            return -1;
        }

        // Perform linear search
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target) {
                return i; // Return the index directly
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int target = 6;
        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
