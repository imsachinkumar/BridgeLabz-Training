public class FootballTeamHeight{
    //Method to generate random heights between 150 and 250
    static int[] generateHeights(){
        int[] heights=new int[11];
        for(int i=0;i<heights.length;i++){
            heights[i]=(int)(Math.random()*101)+150;
        }
        return heights;
    }
    //Method to find sum of heights
    static int findSum(int[] heights){
        int sum=0;
        for(int i=0;i<heights.length;i++){
            sum+=heights[i];
        }
        return sum;
    }

    //Method to find mean height
    static double findMean(int[] heights){
        int sum=findSum(heights);
        return (double)sum/heights.length;
    }
    //Method to find shortest height
    static int findShortest(int[] heights){
        int min=heights[0];
        for(int i=1;i<heights.length;i++){
            if(heights[i]<min){
                min=heights[i];
            }
        }
        return min;
    }
    //Method to find tallest height
    static int findTallest(int[] heights){
        int max=heights[0];
        for(int i=1;i<heights.length;i++){
            if(heights[i]>max){
                max=heights[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] heights=generateHeights();
        System.out.println("Heights of players:");
        for(int i=0;i<heights.length;i++){
            System.out.println("Player "+(i+1)+": "+heights[i]+" cm");
        }
        System.out.println("\nShortest height: "+findShortest(heights)+" cm");
        System.out.println("Tallest height: "+findTallest(heights)+" cm");
        System.out.println("Mean height: "+findMean(heights)+" cm");
    }
}
