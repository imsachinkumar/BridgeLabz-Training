import java.util.*;
public class RockPaperScissors{
    static String computer(){
        int r=(int)(Math.random()*3);   //generate random number 0-2
        return r==0?"rock":r==1?"paper":"scissors";   //map to choice
    }

    static int winner(String u,String c){
        if(u.equals(c))return 0;   //tie
        if((u.equals("rock")&&c.equals("scissors"))||   //user wins conditions
           (u.equals("paper")&&c.equals("rock"))||
           (u.equals("scissors")&&c.equals("paper")))return 1;
        return -1;   //computer wins
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();   //number of games
        int uw=0,cw=0;   //user wins, computer wins

        for(int i=0;i<games;i++){
            String u=sc.next();  
            String c=computer();   //computer choice
            int w=winner(u,c);  
            if(w==1)uw++;   //increment user wins
            if(w==-1)cw++;   //increment computer wins
        }

        System.out.println("User Wins:"+uw);
        System.out.println("Computer Wins:"+cw);
        System.out.println("User %:"+(uw*100.0/games));   //user win percentage
        System.out.println("Computer %:"+(cw*100.0/games));   //computer win percentage
    }
}
