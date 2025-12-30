public class LineComparison {
    
    // Method to calculate length 
    static double calculateLength(int x1,int y1,int x2,int y2){
        int dx=x2-x1;
        int dy=y2-y1;
        return Math.sqrt(dx*dx+dy*dy);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");
        // Coordinates for first line
        int x1=1,y1=2,x2=4,y2=6;
        // Coordinates for second line
        int x3=2,y3=3,x4=6,y4=7;
        // Calculate lengths
        double length1=calculateLength(x1,y1,x2,y2);
        double length2=calculateLength(x3,y3,x4,y4);
        System.out.println("Length of Line 1: "+length1);
        System.out.println("Length of Line 2: "+length2);
        // UC 2-> Check equality using Double equals logic
        if(Double.valueOf(length1).equals(length2)){
            System.out.println("Both lines are equal");
        }else{
            System.out.println("Lines are not equal");
        }
        // UC 3-> Compare lengths using compareTo logic
        int result=Double.valueOf(length1).compareTo(length2);
        if(result==0){
            System.out.println("Both lines are of same length");
        }else if(result>0){
            System.out.println("Line 1 is longer than Line 2");
        }else{
            System.out.println("Line 1 is shorter than Line 2");
        }
    }
}
