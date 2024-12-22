package Arrays;
public class Linear_Search {
    //declaring linearsearch funtion which takes two arguments 
    public static int linearSearch(int[] arr, int target) {
        // Check if array is empty
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
        int[] arr = { 2, 4, 6, 8, 10 };//Modify this array according to you
        int target = 6;// can change the target according to your need
        int result = linearSearch(arr, target);//applying linear seach on the given array

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
