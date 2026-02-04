public class SmartHomeLighting {

    // Functional Interface
    @FunctionalInterface
    interface LightAction {
        void activate();
    }
    public static void main(String[] args) {
        // Motion sensor trigger
        LightAction motion = () ->System.out.println("Motion detected → Lights ON (Full Brightness)");

        // Time based trigger
        LightAction night = () ->System.out.println("Night time → Lights ON (Dim mode)");

        // Voice command trigger
        LightAction voice = () ->System.out.println("Voice command → Lights ON (Color mode)");

        // Execute all actions
        motion.activate();
        night.activate();
        voice.activate();
    }
}
