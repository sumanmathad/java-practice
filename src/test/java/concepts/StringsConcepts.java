package concepts;

import org.junit.jupiter.api.Test;

public class StringsConcepts {

    @Test
    void p1(){
        var line = new StringBuilder("-");
        var anotherLine = line.append("-");
        System.out.print(line == anotherLine);
        System.out.print(" ");
        System.out.print(line.length());
        //string builder is returned when you do append / reverse

    }


}
