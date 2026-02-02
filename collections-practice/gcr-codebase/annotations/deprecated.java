class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("This is the OLD feature (deprecated)");
    }

    void newFeature() {
        System.out.println("This is the NEW feature");
    }
}

public class deprecated{
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();
        api.oldFeature();   // warning 
        api.newFeature();   //
    }
}
