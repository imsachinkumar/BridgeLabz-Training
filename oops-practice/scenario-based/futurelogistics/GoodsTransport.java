abstract class GoodsTransport {
   protected String transportId;
   protected String transportDate;
   protected int transportRating;

   public GoodsTransport(String transportId,String transportDate,int transportRating){
    this.transportId=transportId;
    this.transportDate=transportDate;
    this.transportRating=transportRating;

   }
   public void setId(String id){
    transportId = id;
   }
   public String getTransportId(){
        return transportId;
   }
   public void setDate(String date){
    transportDate = date;
   }
   public String getTransportDate(){
        return transportDate;
   }
   public void setRating(int rating){
    transportRating = rating;
   }
   public int getTransportRating(){
        return transportRating;
   }

public abstract String vehicleSelection();
public abstract float calculateTotalCharge();
}
