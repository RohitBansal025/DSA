package Strings;
public class Reverse_String {
    public static void main(String[] args){
        String str = "Rohit Bansal";
        // Function call
        String result = reverseString(str);
        System.out.println(result);
    }
    // Function to reverse a string
    public static String reverseString(String str){
        char[] arr = str.toCharArray();// Convert string to character array
        int start = 0;
        int end = arr.length - 1;
        while(start < end){// Loop until start is less than end
            char temp = arr[start];// Swap characters
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);// Convert character array to string and return
    }
}
