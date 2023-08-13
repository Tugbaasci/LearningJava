package javaPractice;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class tarihFormatlayici {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy H:mm ");
        LocalDateTime saat = LocalDateTime.now();
        String yeni = saat.format(format);
        System.out.println(yeni);
    }
}
