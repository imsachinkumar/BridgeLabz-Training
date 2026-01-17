public class BufferVsBuilder{
    public static void main(String[] args) {
        int count = 1_000_000;
        //StringBuffer
        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < count; i++) {
            buffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer));
        // StringBuilder
        StringBuilder builder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < count; i++) {
            builder.append("hello");
        }
        
        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder));
    }
}
