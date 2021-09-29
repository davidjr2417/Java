package Warm_Up;

import java.time.Duration;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
// import java.time.format.DateTimeFormatter;

public class Variables {
    public static void main(String[] args){
        while(true){
           
            try {
                LocalDateTime dateTime = LocalDateTime.of(1989, 12, 27, 20, 0, 0);
                TimeConverter.calculateTime(((Duration) AgeCalculator.calculateAgeDuration(dateTime, LocalDateTime.now())).getSeconds());
                Thread.sleep(1500);
            } catch(InterruptedException e) {
                System.out.println("got interrupted!");
            }
        }
       
    }
}

// package Warm_Up;

// import java.time.Period;
// import java.time.Duration;
// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;

// public class Variables {
//     public static void main(String[] args){
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");    
//         LocalDate today = LocalDate.now();
//         LocalDate birthday = LocalDate.parse("17/11/1989", formatter);
        
        
//         Duration p = Duration.between(birthday, today);
//         System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
//                            " months and " + p.getDays() +
//                            " days old.");
//      }
// }
