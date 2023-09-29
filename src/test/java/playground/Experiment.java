package playground;

import com.mysql.cj.PingTarget;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.json.JsonOutput;

import java.util.*;

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
    @Test
    public void findDuplicate() {

        ArrayList<Integer> arr = new ArrayList<>(List.of(4, 2 ,1, 3, 1,3,7,3,0));
        HashSet<Integer>set = new HashSet<>();

        for(Integer i:arr){
            if(!set.add(i)){
                System.out.println(i);
            }
        }

     }

@Test
public  void loops(){
    int [] nums = {6,5,4,4};
    boolean increasing = true;
    boolean decreasing = true;
    for (int i = 0; i < nums.length - 1; ++i) {
        if (nums[i] > nums[i+1])
            increasing = false;
        if (nums[i] < nums[i+1])
            decreasing = false;
    }
    System.out.println( increasing || decreasing);
}



    static void funct(int[] x){
        x[0]=x[0]+10;
    }

    @Test
    public void passbyvalue(){
        int[] x={1};
        funct(x);
        System.out.println(Arrays.toString(x));
    }



    @Test
    public void textblocks() {
    var text = """
            ant  antelope \s \n
            cat "kitten" \
            seal sea lion
            """;
    System.out.print(text);


}
    @Test
    public void ToString(){
        String[] arr = {"one", "two", "three"};

        System.out.println(String.join("",arr));
    }




}
