public class MatrixAdvanced{
    // create random matrix
    static double[][] createMatrix(int r,int c){
        double[][] m=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j]=1+(int)(Math.random()*9); // 1 to 9
            }
        }
        return m;
    }
    // transpose of matrix
    static double[][] transpose(double[][] a){
        int r=a.length,c=a[0].length;
        double[][] t=new double[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[j][i]=a[i][j];
            }
        }
        return t;
    }
    // determinant of 2x2 matrix
    static double det2(double[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }
    // determinant of 3x3 matrix
    static double det3(double[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    // inverse of 2x2 matrix
    static double[][] inv2(double[][] m){
        double det=det2(m);
        if(det==0) return null;
        double[][] inv=new double[2][2];
        inv[0][0]= m[1][1]/det;
        inv[0][1]=-m[0][1]/det;
        inv[1][0]=-m[1][0]/det;
        inv[1][1]= m[0][0]/det;
        return inv;
    }
    // inverse of 3x3 matrix
    static double[][] inv3(double[][] m){
        double det=det3(m);
        if(det==0) return null;

        double[][] inv=new double[3][3];
        inv[0][0]=(m[1][1]*m[2][2]-m[1][2]*m[2][1])/det;
        inv[0][1]=(m[0][2]*m[2][1]-m[0][1]*m[2][2])/det;
        inv[0][2]=(m[0][1]*m[1][2]-m[0][2]*m[1][1])/det;

        inv[1][0]=(m[1][2]*m[2][0]-m[1][0]*m[2][2])/det;
        inv[1][1]=(m[0][0]*m[2][2]-m[0][2]*m[2][0])/det;
        inv[1][2]=(m[0][2]*m[1][0]-m[0][0]*m[1][2])/det;

        inv[2][0]=(m[1][0]*m[2][1]-m[1][1]*m[2][0])/det;
        inv[2][1]=(m[0][1]*m[2][0]-m[0][0]*m[2][1])/det;
        inv[2][2]=(m[0][0]*m[1][1]-m[0][1]*m[1][0])/det;

        return inv;
    }
    // display matrix
    static void print(double[][] m){
        if(m==null){
            System.out.println("Inverse not possible (Determinant = 0)");
            return;
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.printf("%.2f\t",m[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        // example with 2x2
        double[][] m2=createMatrix(2,2);
        System.out.println("2x2 Matrix:");
        print(m2);
        System.out.println("Transpose:");
        print(transpose(m2));
        System.out.println("Determinant: "+det2(m2));
        System.out.println("Inverse:");
        print(inv2(m2));
        // example with 3x3
        double[][] m3=createMatrix(3,3);
        System.out.println("\n3x3 Matrix:");
        print(m3);
        System.out.println("Transpose:");
        print(transpose(m3));
        System.out.println("Determinant: "+det3(m3));
        System.out.println("Inverse:");
        print(inv3(m3));
    }
}
