package javaPractice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class tarihSaat {
    public static void main(String[] args) {


        LocalDateTime dogumTarihim= LocalDateTime.of(1983,2,22,02,00);
        LocalDateTime evlilikTarihim= LocalDateTime.of(2006,9,2,20,00);
        Duration duration =Duration.between(dogumTarihim,evlilikTarihim);
        long gun = duration.toDays();
        long saat =  duration.toHoursPart();
        long dk = duration.toMinutesPart();
        long sn = duration.toSecondsPart();
        System.out.println("Evlendigim gun "+gun+".gun "+saat+".saat "+dk+".dk "+sn+".sn'mde imisim");
    }
}
