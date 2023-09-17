package collections.Sets;

import org.junit.jupiter.api.Test;

import java.util.*;

public class HashSets {

    @Test
    public void hashSetsDefinitionLoad(){
        Set anyHashSet = new HashSet();

        anyHashSet.add("one");
        anyHashSet.add(2);
        anyHashSet.add(true);
        System.out.println("Adding a symbol $ : "+anyHashSet.add('$'));
        System.out.println("Adding a duplicate value : "+anyHashSet.add("one"));
        System.out.println("Adding null: "+anyHashSet.add(null));
        System.out.println("Adding duplicate null: "+anyHashSet.add(null));
        //add method returns boolean value of addition process result.

        System.out.println(anyHashSet);
        // order is not preserved , Duplicates not allowed.

        HashSet<String> stringHashSet1= new HashSet();
        HashSet<Integer> intHashSet= new HashSet<Integer>();

        HashSet<ArrayList> arrayListSet = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add("one");
        list2.add("two");
        arrayListSet.add(list1);
        arrayListSet.add(list2);
        System.out.println(arrayListSet);

        //Storage in HashMap:
        // The value we insert in HashSet acts as a key to the map Object and for its value, java uses a constant variable.
        // So in the key-value pair, all the values will be the same.

        HashSet hs =new HashSet();
        //HashSet() constructor is used to build an empty HashSet object in which the default initial capacity is 16
        // and the default load factor is 0.75

        HashSet hs1=new HashSet<>(20);
        //HashSet<E> hs = new HashSet<E>(int initialCapacity);  Here, the default loadFactor remains 0.75.
        //HashSet<E> hs = new HashSet<E>(int initialCapacity, float loadFactor);
        //HashSet<E> hs = new HashSet<E>(Collection C);



    }

    @Test
    public void hashSetMethods(){
        HashSet numbers = new HashSet();
        numbers.add("test");
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
    }

}
