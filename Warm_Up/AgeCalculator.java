package Warm_Up;
import java.time.Duration;
import java.time.LocalDateTime;

public class AgeCalculator {
    public static Duration calculateAgeDuration(LocalDateTime dayBefore, LocalDateTime currentDay) {
            return Duration.between(dayBefore, currentDay);
    }
}