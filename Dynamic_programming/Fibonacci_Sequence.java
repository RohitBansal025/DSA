package Dynamic_programming;
// Fibonacci Sequence is a series of numbers in which each number is the sum of the two preceding ones.
public class Fibonacci_Sequence {
    public static void main(String[] args){
        int n = 6;
        // Function call
        int result = fibonacci(n);// Function to calculate the nth Fibonacci number
        System.out.println("The "+n+"th Fibonacci number is "+result);
    }
    public static int fibonacci(int n){// Function to calculate the nth Fibonacci number
        // Variables to store the previous two numbers
        int prev1=1;
        int prev2=0;
        // Base case
        if(n ==0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        for(int i = 2; i <= n; ++i){// Loop to calculate the nth Fibonacci number
           int dp=prev1+prev2;
              prev2=prev1;
                prev1=dp;
        }
        return prev1;// Return the nth Fibonacci number
    }
    
}
