public class DigitalWatchSimulation{
    public static void main(String[] args){
        System.out.println("Digital Watch Started...");
        // Loop through hours (0 to 23)

        for(int hour=0;hour<24;hour++){
            // Loop through minutes (0 to 59)
            for(int minute=0;minute<60;minute++){
                // Print time in HH:MM format

                System.out.printf("%02d:%02d\n",hour,minute);
                if(hour==13 && minute==0){
                    System.out.println("Power cut! Watch stopped.");
                    return;
                }
            }
        }
        System.out.println("Digital Watch Completed.");
    }
}
