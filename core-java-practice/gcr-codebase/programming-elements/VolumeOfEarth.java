public class VolumeOfEarth {
    public static void main(String[] args) {
        double rd = 6378;
        double pi = 3.14159;
        double volum = (4.0 / 3.0) * pi * rd * rd * rd;
        double rads = rd * 0.621371;
        double ans = (4.0 / 3.0) * pi * rads * rads * rads;
        System.out.println("Volume of Earth in cubic kilometers: " + volum);
        System.out.println("Volume of Earth in cubic miles: " + ans);
    }
}
