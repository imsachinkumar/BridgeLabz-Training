public class TemperatureAnalyzer{
    static void analyzeTemperature(float[][] temp){
        // Variables to store hottest and coldest average temperature
        float hottestAvg=temp[0][0];
        float coldestAvg=temp[0][0];
        int hottestDay=0;
        int coldestDay=0;
             //Loop for each day
        for(int day=0;day<temp.length;day++){
            float dailySum=0;
            // Loop for each hour 
            for(int hour=0;hour<temp[day].length;hour++){
                dailySum+=temp[day][hour];
            }
          // Calculating average temperature of the day
            float dailyAvg=dailySum/temp[day].length;
            System.out.println("Day "+(day+1)+" Average = "+dailyAvg);
            // Check and store hottest day
            if(day==0||dailyAvg>hottestAvg){
                hottestAvg=dailyAvg;
                hottestDay=day+1;
            }
            // Check and store coldest day
            if(day==0||dailyAvg<coldestAvg){
                coldestAvg=dailyAvg;
                coldestDay=day+1;
            }
        }
        System.out.println("Hottest Day: Day "+hottestDay);
        System.out.println("Coldest Day: Day "+coldestDay);
    }
    public static void main(String[] args){
        float[][] weeklyTemp=new float[7][24];
        for(int i=0;i<7;i++){
            for(int j=0;j<24;j++){
                weeklyTemp[i][j]=20+(float)(Math.random()*15);
            }
        }
        analyzeTemperature(weeklyTemp);
    }
}
