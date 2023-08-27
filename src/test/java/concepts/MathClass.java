package concepts;

import org.junit.jupiter.api.Test;

public class MathClass {

    @Test
    public void MoreThanIntMax(){
        int ThreeLessThanMax = Integer.MAX_VALUE-3;
        for(int i=0;i<=6;i++){
            System.out.println(ThreeLessThanMax);
            ThreeLessThanMax++;
        }
        // program overflows
        //Avoid overflow with incrementExact and throw an exception
        int newThreeLessThanMax = Integer.MAX_VALUE;
        for(int i=0, id =newThreeLessThanMax ; i<=6;Math.incrementExact(newThreeLessThanMax),i++){
            System.out.println(newThreeLessThanMax);
            ThreeLessThanMax++;
        }
    }
}
