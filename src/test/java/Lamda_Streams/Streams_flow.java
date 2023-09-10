package Lamda_Streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_flow {

    @Test
    public void StreamsDefn(){
        Stream<Integer> emptyStream = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> multiplrElements = Stream.of(1,2,3);

        var list = List.of(1,2,3,4,5);
        Stream<Integer> listStream = list.stream();

        System.out.println(emptyStream);
        System.out.println(singleElement);


    }

    @Test
    public void StreamMethods(){
        Integer[] integerArray = {1,2,3,4,5,null};
        int[] intArray ={1,2,3,4};
        List<Integer> numbers =  Arrays.asList(integerArray);
       // ArrayList<Integer> evenNumbers = new ArrayList<>();
        List<Integer> evenNumbers = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        ArrayList<Integer> arrayListNumbers = new ArrayList<>(evenNumbers);
        System.out.println(arrayListNumbers);
    }


}
