package concepts;

import org.junit.jupiter.api.Test;

public class MathClass {

    @Test
    public void MoreThanIntMax() {
        int ThreeLessThanMax = Integer.MAX_VALUE - 3;
        for (int i = 0; i <= 6; i++) {
            System.out.println(ThreeLessThanMax);
            ThreeLessThanMax++;
        }
        // program overflows
        //Avoid overflow with incrementExact and throw an exception
        int newThreeLessThanMax = Integer.MAX_VALUE;
        for (int i = 0, id = newThreeLessThanMax; i <= 6; Math.incrementExact(newThreeLessThanMax), i++) {
            System.out.println(newThreeLessThanMax);
            ThreeLessThanMax++;
        }
    }

    @Test
    public void MathAbsolute(){
        System.out.println(Math.abs(-0.2));
        //returns double
        System.out.println(Math.abs(Integer.MIN_VALUE));
        //Overflow happens
        //System.out.println(Math.absExact(Integer.MIN_VALUE));
        //exception - works with language level 15 textblocks
        System.out.println(Math.abs((long)Integer.MIN_VALUE));

        System.out.println(Math.abs(-3.8951));
        double d= Math.abs(-3.3);
        System.out.println(d);
    }


}

