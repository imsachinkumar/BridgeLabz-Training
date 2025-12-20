import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
       
        int[][] matrix = new int[rows][cols];

        // 1D array to store all elements
        int[] array = new int[rows * cols];

        // Index for 1D array
        int index = 0;
        // Convert 2D array into 1D array
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                matrix[i][j] = sc.nextInt();
                array[index++] = matrix[i][j];
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
