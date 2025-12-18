public class ProfitLoss {
    public static void main(String[] args) {
        double cp = 129;
        double sp = 191;

        if (sp > cp) {
            double pf = sp - cp;
            double pfpercent = (pf / cp) * 100;
            System.out.println("profit is: "+ pf+ "  rs and Profit Percentage: " + pfpercent + "%");

        }
         else if (cp > sp) {
            double ls = cp - sp;
            double lspercent = (ls / cp) * 100;
            System.out.println("loss is: "+ls +" rs and Loss Percentage: " + lspercent + "%");
        } else {
            System.out.println("No Profit No Loss");
        }
    }
    
}