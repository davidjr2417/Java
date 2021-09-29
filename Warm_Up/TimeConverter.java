package Warm_Up;



public class TimeConverter {
    public static void calculateTime(long timeSeconds) {
        long years = (timeSeconds / 86400)/365; // 24*60*60
        long days = timeSeconds / 86400; // 24*60*60
        long hours = timeSeconds / 3600;
        // long minutes = (timeSeconds % 3600) / 60;
        long minutes = timeSeconds / 60;
        long seconds = timeSeconds;

        System.out.println("Years: " + years);
        System.out.println("Days: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}

