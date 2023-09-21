package concepts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class StringsConcepts {

    @Test
    void p1(){
        var line = new StringBuilder("-");
        var anotherLine = line.append("-");
        System.out.println(line == anotherLine);
        System.out.println(line.equals(anotherLine));
        System.out.println(line);
        System.out.println(anotherLine);
        System.out.println("Third ");
        var thirdLine = new StringBuilder(line.append("-"));
        System.out.println(line);
        System.out.println(thirdLine);
        System.out.println(line == anotherLine);
        System.out.println(line.equals(thirdLine));

        //string builder is returned when you do append / reverse
        System.out.println("Strings");
        String a1 ="abc";
        String a2="abc";
        String a3 = new String("abc");
        System.out.println(a1==a3);
        System.out.println(a1==a2);
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a2));

        System.out.println("string builder");
        StringBuilder s1 = new StringBuilder("Test");
        StringBuilder s2 = new StringBuilder("Test");

        System.out.println(s1); // output: Test
        System.out.println(s2); // Test
        System.out.println(s1==s2); // false
        System.out.println(s1.equals(s2)); //Line 1 output: false
        System.out.println(s1.toString()==s2.toString()); //Line 2 output: false

    }

    @Test
    public void StringMethods(){
        String justQuotes="";
        System.out.println("isBlank "+justQuotes.isBlank());
        System.out.println("isEmpty "+justQuotes.isEmpty());

        String oneSpace= " ";
        System.out.println("isBlank "+oneSpace.isBlank());
        System.out.println("isEmpty "+oneSpace.isEmpty());

        String moreWhitespace ="  this  is      not a good    line.  ";
        System.out.println(moreWhitespace);
        System.out.println("Regex of \\s :"+ Arrays.toString(moreWhitespace.split("\\s")));
        System.out.println("Regex of \\s+ :"+Arrays.toString(moreWhitespace.split("\\s+")));
        System.out.println("Regex of \\s+ with strip :"+Arrays.toString(moreWhitespace.strip().split("\\s+")));
        System.out.println("Regex of empty Quotes :"+Arrays.toString(moreWhitespace.split("")));
        System.out.println("Regex of one space Quotes :"+Arrays.toString(moreWhitespace.split(" ")));

        //https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html

        System.out.println(moreWhitespace.replaceAll("^\\s+",""));  //replace in beginning
        System.out.println(moreWhitespace.replaceFirst("\\s+","")); // replace in beginning
        System.out.println(moreWhitespace.replaceAll("\\s+$",""));  // replace in end
        System.out.println(moreWhitespace.replace("\\s+$",""));  // No change as its not a char/ char sequence
    }

}
