package bits.BitWiseOperators;

import org.junit.jupiter.api.Test;

public class BaseConversions {

    public static void main(String[] args) {
        String a ="1010";
        String b="1011";

        int numa=Integer.parseInt(a,2);
        int numb=Integer.parseInt(b,2);
        System.out.println( Integer.toBinaryString(numa+numb));

    }

    @Test
    public void ConvertDecimalToBase7(){
        int num= -51;
        int div=Math.abs(num);
        StringBuilder base7= new StringBuilder();
        while(!(div==0)){
            base7.insert(0,div%7);
            div=div/7;
        }
        if(num<0){
            base7.insert(0,"-");
        }
        System.out.println(base7);



    }



}
