package concepts;

import org.junit.jupiter.api.Test;

public class FormatTexts {

    @Test
    public void formatNumbers(){
        int num = 1234567;
        int test=1;

        System.out.printf("%d%n",num);  //1234567
        System.out.printf("%,d%n",num); //1,234,567
        System.out.printf("%, d%n",num);  // 1,234,567
        System.out.printf("%d %d",test, num); //1 1234567

    }





}
