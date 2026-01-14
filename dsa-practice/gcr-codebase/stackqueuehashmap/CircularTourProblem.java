public class CircularTourProblem {
    public static int findStartingPump(int[] petrol,int[] distance){
        int n=petrol.length;
        int start=0;
        int balance=0;
        int deficit=0;

        for(int i=0;i<n;i++){
            balance+=petrol[i]-distance[i];
            // If balance becomes negative, reset start
            if(balance<0){
                deficit+=balance;
                start=i+1;
                balance=0;
            }
        }
        // Check if total petrol is sufficient
        if(balance+deficit>=0){
            return start;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] petrol={4,6,7,4};
        int[] distance={6,5,3,5};
        int start=findStartingPump(petrol,distance);
        if(start!=-1){
            System.out.println("Start at petrol pump index: "+start);
        }else{
            System.out.println("Circular tour not possible");
        }
    }
}
