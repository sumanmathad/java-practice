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
    public void ArrayListMethods(){
        ArrayList numbers = new ArrayList(List.of(0,1,2,3,4,5));
        System.out.println(numbers);

        System.out.println( "numbers array : "+numbers);
        System.out.println("isEmpty : " +numbers.isEmpty());
        System.out.println("contains(3) : "+numbers.contains(3));
        System.out.println("size : " +numbers.size());

        //public boolean add(E element)

        System.out.println(numbers.add(6));
        System.out.println(numbers);
        //public void add(int index, E element)

        numbers.add(0,-1);
        System.out.println(numbers);

        //public boolean remove(Object object)
        System.out.println(numbers.remove(6));
        //returns the removed object
        int abc =6;
        System.out.println(numbers.remove(abc));
        System.out.println(numbers);
        //public boolean isEmpty()
        //public int size()
        //public void clear()
        //public boolean contains(Object object)
        System.out.println(numbers.contains(-1));
        System.out.println("Current status: "+numbers);
        System.out.println(numbers.set(1,"zero"));
        System.out.println("after set status: "+numbers);
        Object[] arr=  numbers.toArray();
        System.out.println(Arrays.toString(arr));
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

       // public boolean removeIf(Predicate<? super E> filter)
        // public void forEach(Consumer<? super T> action)
    }



}
