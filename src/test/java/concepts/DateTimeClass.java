package concepts;

import org.junit.jupiter.api.Test;

import java.time.*;

public class DateTimeClass {

    @Test
    public void DateTime(){
        LocalDate dateObj = LocalDate.now();
        System.out.println(dateObj);  //yyyy-mm-dd
        System.out.println( dateObj.getDayOfMonth());//date
        System.out.println(dateObj.isLeapYear());
        System.out.println(dateObj.getMonth());
        System.out.println(dateObj.plusMonths(2));
    }

    @Test
    public void date(){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
    }

}
