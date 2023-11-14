package bits.BitWiseOperators;


import org.openqa.selenium.json.JsonOutput;

import java.security.PublicKey;

public class BinaryPractice {

    public static void main(String[] args) {
        System.out.println("Binary of 7 is "+Integer.toBinaryString(-47));

        System.out.println("And of 3 & 7 is "+ (3&7));
        System.out.println("XOR of 3 & 7 is" +(3^7));  //XOR  -- odd 1's 1, even 1's is 0
        System.out.println("OR of 5 and 7 is "+(5|7));    //OR
        System.out.println(~5);  //Negation
        System.out.println(10>>3);
        System.out.println(10<<3);

        swap(5,9);
        uniqueInArray(new int[] {4,3,6,7,3,4,6,7,5});
        System.out.println(xORofN(8));
        System.out.println(xOROfRange(3,6));
        evenOrOdd(4543547);
    }


    /****************** Even or Odd   ******************************/
    public static void evenOrOdd(int a){

        if((a&1)==0){
            System.out.println(+a+" is even");
        }
        else System.out.println(+a+" is odd");


    }

    /************************** End ********************************/




    public static void swap(int a, int b){
        System.out.println("Before : a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("After : a="+a+" b="+b);

    }

    /****************** Unique Integer *******************************/

    public static void uniqueInArray(int[] arr){
        int unique = 0;
        for(int i=0;i< arr.length;i++){
             unique=unique^arr[i];
        }
        System.out.println(unique);
    }
     /************************** End ********************************/


    /****************** Print XOR of all numbers till N *******************************/

     public static int xORofN(int n) {
        switch (n%4){
            case 0:
                return n;
            case 1:
                return 1;
            case 2:
                return n+1;
            case 3:
                return 0;
        }
        return 0;
     }
     /************************** End ********************************/

     public static int xOROfRange(int a,int b){
        return xORofN(b)^xORofN(a-1);
     }


}
/******************    ******************************/

/************************** End ********************************/