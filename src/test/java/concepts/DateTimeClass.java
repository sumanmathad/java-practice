package concepts;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.time.*;

public class DateTimeClass {

    @Test
    public void DateTime() {
        LocalDate dateObj = LocalDate.now();
        System.out.println(dateObj);  //yyyy-mm-dd
        System.out.println(dateObj.getDayOfMonth());//date
        System.out.println(dateObj.isLeapYear());
        System.out.println(dateObj.getMonth());
        System.out.println(dateObj.plusMonths(2));
    }

    @Test
    void general() {
        System.out.println(LocalDate.now()); //yyyy-mm-dd
        System.out.println(LocalTime.now()); //hh:mm:ss.fractional seconds
        System.out.println(LocalDateTime.now()); //yyyy-mm-ddThh:mm:ss.fractional seconds
        System.out.println(ZonedDateTime.now()); //yyyy-mm-ddThh:mm:ss.fractional seconds+-time zone offset and time zone

        var date1 = LocalDate.of(2022, 1, 20);
        var date2 = LocalDate.of(2023, Month.SEPTEMBER, 10);
        System.out.println(date1);
        System.out.println(date2);

        var time1 = LocalTime.of(6, 15);              // hour and minute
        var time2 = LocalTime.of(6, 15, 30);          // + seconds
        var time3 = LocalTime.of(6, 15, 30, 2007);     // + nanoseconds
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        var datetime1 = LocalDateTime.of(2023, Month.SEPTEMBER, 10, 12, 48, 50);
        var datetime2 = LocalDateTime.of(date1, time1);
        System.out.println(datetime1);
        System.out.println(datetime2);

        var zone = ZoneId.of("Asia/Calcutta");
        var zoned1 = ZonedDateTime.of(datetime1, zone);
        System.out.println(zoned1);
    }

    @Test
    void DateActions() {
        var sep1 = LocalDate.of(2023, Month.SEPTEMBER, 1);
        System.out.println(sep1.plusDays(32));
        System.out.println(sep1.plusDays(2));
        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        performAnimalEnrichment(start, end);


    }

    void performAnimalEnrichment(LocalDate start, LocalDate end) {
        var upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }

    }

    @Test
    void Periods(){
        System.out.println(Period.of(1,2,4));
        System.out.println(Period.ofMonths(3));
    }

}