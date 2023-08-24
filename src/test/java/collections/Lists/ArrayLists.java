package collections.Lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    @Test
    public void arrayListdefinitionandLoad(){

        //define and add heterogeneous data
        List anyList = new ArrayList();
        anyList.add("test");
        anyList.add(1);
        anyList.add(true);
        System.out.println(anyList.add(1));
        //returns the addition process status result
        System.out.println(anyList);
        //o/p > test, 1, true,1 -- insertion order is preserved and duplicates are allowed.


        //define and add homogeneous data
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add(0,"first");

        // returns boolean after adding value
        System.out.println(stringList.add("two"));

        // doesn't return any value when added with index
        stringList.add(0,"updated after first");

        System.out.println(stringList);

    }
    @Test
    public void ArrayListBasicMethods(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<5;i++){
            numbers.add(i);
        }
        System.out.println( "numbers array : "+numbers);
        System.out.println("Is numbers empty? : " +numbers.isEmpty());
        System.out.println("does numbers contain 3? : "+numbers.contains(3));
        System.out.println("Size of numbers array? : " +numbers.size());

    }


    @Test
    public void ListsConversions(){
        ArrayList<String> arr1 = new ArrayList<>();

        arr1.add(0,"zero");
        arr1.add(1,"one");
        arr1.add(2,"two");

        ArrayList<String> arr2 = (ArrayList<String>) arr1.clone();
        //The clone() method returns an object, so you'll have to cast it to a proper array list manually.

        System.out.println(arr2);

        //compare two Arrays
        System.out.println(arr1.equals(arr2));

        Object[] stringArray =  arr2.toArray();
        //toArray() returns an Object[]. we cannot cast to String[] as it will throw ClassCastException
        System.out.println(Arrays.toString(stringArray));


    }



}
