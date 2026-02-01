public class TimberTransport extends GoodsTransport {
    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

     public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }
   
    @Override
    public String vehicleSelection(){

           double Area=2*3.147*timberRadius*timberLength;
           if(Area<250) return "Truck";
           if(Area >=250 && Area<=400) return "Lorry";
           return "MonsterLorry";
    }
      @Override
    public float calculateTotalCharge() {
        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        float rate = timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f;
        float price = volume * timberPrice * rate;
        float tax = price * 0.3f;

        float discount = 0;
        if (transportRating == 5)
            discount = price * 0.20f;
        else if (transportRating == 3 || transportRating == 4)
            discount = price * 0.10f;

        int vehiclePrice = getVehiclePrice(vehicleSelection());

        return (price + tax + vehiclePrice) - discount;
    }
   
    private int getVehiclePrice(String vehicle) {
        if (vehicle.equalsIgnoreCase("Truck"))
            return 1000;
        else if (vehicle.equalsIgnoreCase("Lorry"))
            return 1700;
        else
            return 3000;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }
}
