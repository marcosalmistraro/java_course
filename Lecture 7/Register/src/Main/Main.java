package Main;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
            date.format(formatter);

            System.out.println(date);
            Thread.sleep(1000);
        }
        System.out.println("OVER");
    }
    
}
