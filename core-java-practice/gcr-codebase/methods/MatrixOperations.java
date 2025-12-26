public class MatrixOperations{
    // create random matrix
    static int[][] createMatrix(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=1+(int)(Math.random()*9); // 1 to 9
            }
        }
        return m;
    }
    // add two matrices
    static int[][] add(int[][] a,int[][] b){
        int r=a.length,c=a[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=a[i][j]+b[i][j];
            }
        }
        return res;
    }
    // subtract two matrices
    static int[][] subtract(int[][] a,int[][] b){
        int r=a.length,c=a[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[i][j]=a[i][j]-b[i][j];
            }
        }
        return res;
    }
    // multiply two matrices
    static int[][] multiply(int[][] a,int[][] b){
        int r1=a.length,c1=a[0].length,c2=b[0].length;
        int[][] res=new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    res[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        return res;
    }
    // display matrix
    static void print(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int r=3,c=3;
        int[][] A=createMatrix(r,c);
        int[][] B=createMatrix(r,c);
        System.out.println("Matrix A:");
        print(A);
        System.out.println("\nMatrix B:");
        print(B);
        System.out.println("\nA + B:");
        print(add(A,B));
        System.out.println("\nA - B:");
        print(subtract(A,B));
        System.out.println("\nA * B:");
        print(multiply(A,B));
    }
}
