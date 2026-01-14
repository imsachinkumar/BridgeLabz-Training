import java.util.*;
public class LongestConsecutiveSequence {
    public static int longestSequence(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }

        int maxLen=0;
        for(int num:arr){
            if(!set.contains(num-1)){
                int curr=num;
                int len=1;

                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }

                maxLen=Math.max(maxLen,len);
            }
        }
        return maxLen;
    }

    public static void main(String[] args){
        int[] arr={100,4,200,1,3,2};
        System.out.println(longestSequence(arr));
    }
}
