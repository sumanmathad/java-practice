package Arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysClass {
//global declaration
   static int[] arr = new int[6];

    public static void main(String[] args) {
        int[] arr1 = new int[6];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(ArraysClass.arr));

        int[] nums = new int[]{-2, 6, 1, 0, 7, 3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[5]);


    }
    @Test
    public void arrayReferences() {
    int[] nums={1,2,3};
    int[] numsCopy = nums;
    nums[2]=0;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsCopy));
    }

}
