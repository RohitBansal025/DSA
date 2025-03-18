package Arrays;

public class Prefix_sum {
    public static void main(String [] args){
        int [] arr = {1, 2, 3, 4, 5};
         int ans=Prefix_sum(arr,1,3);
         System.out.println("Prefix Sum "+ ans);

    }
     public static int Prefix_sum(int[] arr,int start , int end  ){
        int n=arr.length;
        int sum=0;
        if(n<end || n<start){
            System.out.println("Index Out of Bound");
            return -1;
        }
        for(int i=start; i<=end;i++){
           
            sum+=arr[i];
        }
        return sum;
     }
}
