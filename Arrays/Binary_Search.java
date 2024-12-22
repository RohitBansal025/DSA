package Arrays;
// Binary Search is a searching algorithm that finds the position of a target value within a sorted array.
public class Binary_Search{
    public static void main(String[] args){
        // Array must be sorted
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 5;
        // Function call
        int result = binarySearch(arr, target);
        if(result == -1){
            System.out.println("Element not found");
        }
        else
        System.out.println("Target found at index "+result);
    }
    // Function to perform binary search
    public static int binarySearch(int[] arr, int target){
        // Start and end pointers
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){// Loop until start is less than or equal to end
            int mid = start + (end - start) / 2;// Calculate mid
            if(arr[mid] == target){
                return mid;// Return index if target is found
            }
            else if(arr[mid] < target){
                start = mid + 1;// Update start if target is greater than mid
            }
            else{
                end = mid - 1;// Update end if target is less than mid
            }
        }
        return -1;// Return -1 if target is not found
    }
}