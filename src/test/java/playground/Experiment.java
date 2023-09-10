package playground;

import org.openqa.selenium.json.JsonOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static com.google.common.primitives.Ints.asList;

/*
This is a playground for java code. May be deleted
 */
public class Experiment {
    public static void main(String[] args) {


        Integer four = 4;
        List<Integer> nums = new ArrayList<>(asList(4, 8, 15, 16, 23, 42));
        System.out.println(nums.remove(four));
        System.out.println(nums.remove(1));
        System.out.println(nums);

/*

        int[] arr = {3,4,9,5,6,7,8,2}; int number=8;

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            if(list.contains(number-arr[i])){
                System.out.println(arr[i]+","+(number-arr[i]));
            }
            list.add(arr[i]);
        }



*/


        //*** array conversion to List
        String arra[] = {"test","abc"};
        List<String> arrlist = Arrays.asList(arra);
        System.out.println(arrlist);

        Integer[] ints = new Integer[] {1,2,3,4,5};
        List<Integer> alist = Arrays.asList(ints);
        System.out.println(alist);

    }




}
