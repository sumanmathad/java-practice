package StringsPack;

import java.util.HashMap;
import java.util.Map;

public class StringsClass {

    public static void main(String[] args) {

        String val = String.valueOf('1'+'e');
        char val1 ='0';
        char val2= '1';

        String value = "abc";
        System.out.println(value.codePointAt(0));
        System.out.println(value.codePointBefore(3));
        System.out.println(value.codePointCount(0,3));
        System.out.println(value.offsetByCodePoints(0,3));

        Map<Character, Boolean> chars = new HashMap<>();

    }







}
