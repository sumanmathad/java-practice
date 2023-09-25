package concepts.Recursions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Basic {

    //Sum of First N numbers

    public static void main(String[] args) {
       // sumOfN(3,0);
        // System.out.println(sumOfN(4));
       // System.out.println(fact(5));

        System.out.println(reverse(new int[] {2,4,6,8,10,12}));
    }

    private static String reverse(int[] ints) {

        swapArray(0, ints);


        return Arrays.toString(ints);
    }

    private static void swapArray(int i, int[] ints) {

        if(!(i< ints.length/2)){
            return;
        }
        int temp =ints[i];
        ints[i]=ints[ints.length-i-1];
        ints[ints.length-i-1]=temp;

        swapArray(i+1, ints);

    }

    private static int fact(int i) {
        if(i==1){
            return 1;
        }
        else return i*fact(i-1);
    }

    //Parameterised recursion.
    public static void sumOfN(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        else
            sumOfN(i-1,sum+i);
    }

    //Functional recursion with return
    public static int sumOfN(int num){
        if(num==0)
            return 0;
        else
            return num+sumOfN(num-1);
    }



//////////////////////////////////////////////////////////////////////////
    @Test
    public void Palindrome(){
        String value = "Mad1M";
        char[] arr=value.toCharArray();
        System.out.println(checkPalindrome(0, arr));
    }

    private boolean checkPalindrome(int i,char[] value) {
        if(!(i< value.length/2)){
            return true;
        }
        if(value[i]!=value[value.length-i-1]){
            return false;
        }
        return checkPalindrome(i+1,value);
    }
//
// Time - O(n/2)
////////////////////////////////////////////////////////////////////////////






}
