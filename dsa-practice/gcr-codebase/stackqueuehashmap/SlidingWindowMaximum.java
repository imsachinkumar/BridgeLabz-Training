import java.util.Deque;
import java.util.ArrayDeque;
public class SlidingWindowMaximum {
    // Method to calculate max sliding Window
    public static int[] maxSlidingWindow(int[] nums,int k){
        int n=nums.length;
        if(n==0 || k==0){
            return new int[0];
        }
   
        int[] result=new int[n-k+1];
        Deque<Integer> deque=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            // Remove indices that are out of current window
            if(!deque.isEmpty() && deque.peekFirst()<=i-k){
                deque.pollFirst();
            }

            // Remove smaller elements from back
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }
            deque.offerLast(i);

            // Store result when window is complete
            if(i>=k-1){
                result[i-k+1]=nums[deque.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        
        // Storing result
        int[] result=maxSlidingWindow(nums,k);
        System.out.print("Sliding Window Maximum: ");
        for(int val:result){
            System.out.print(val+" ");
        }
    }
}
