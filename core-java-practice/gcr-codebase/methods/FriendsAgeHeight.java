import java.util.*;
public class FriendsAgeHeight{

    //Method to find youngest friend

    static int findYoungest(int[] ages){
        int minIndex=0;
        for(int i=1;i<ages.length;i++){
            if(ages[i]<ages[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }

    //Method to find tallest friend

    static int findTallest(int[] heights){
        int maxIndex=0;
        for(int i=1;i<heights.length;i++){
            if(heights[i]>heights[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] names={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        int[] heights=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter age of "+names[i]+": ");
            ages[i]=sc.nextInt();
            System.out.print("Enter height of "+names[i]+": ");
            heights[i]=sc.nextInt();
        }
        int youngestIndex=findYoungest(ages);
        int tallestIndex=findTallest(heights);
        System.out.println("Youngest friend is "+names[youngestIndex]);
        System.out.println("Tallest friend is "+names[tallestIndex]);
        sc.close();
    }
}
