package concepts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.google.common.primitives.Ints.asList;

public class ArrayListsConcepts extends ArrayList {

    @Test
    public void RemoveValuesFromLists(){
        Integer four = 4;
        int two =2;
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4, 8, 15, 16, 23, 42));
        System.out.println(nums.remove(two));
        // two is int value and hence index 2,i.e. 8 will be removed with 8 as o/p
        System.out.println(nums);
        System.out.println(nums.remove(four));
        // four is object and not int index, so 4 object is removed and returns true;
        System.out.println(nums);

    }
    @Test
    void removeSublist(){
        List<Integer> intList= new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6));
        intList.subList(2,4).clear();
        System.out.println(intList);
        intList.add(2,2);
        intList.add(3,3);
        System.out.println(intList);
        //remove range is a protected method so extend the class and create an object
        ArrayListsConcepts concepts = new ArrayListsConcepts();
        concepts.add(0);
        concepts.add(1);
        concepts.add(2);
        concepts.add(3);

        concepts.removeRange(1,3);
        System.out.println(concepts);

    }


}
