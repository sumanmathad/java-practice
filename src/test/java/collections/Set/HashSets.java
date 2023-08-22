package collections.Set;

import org.junit.jupiter.api.Test;

import java.util.*;

public class HashSets {

    @Test
    public void hashSetsDefinitionLoad(){
        Set anyHashSet = new HashSet();
        anyHashSet.add("one");
        anyHashSet.add(2);
        anyHashSet.add(true);
        System.out.println(anyHashSet.add('$'));
        System.out.println(anyHashSet.add("one"));
        //returns boolean value of addition process result.

        System.out.println(anyHashSet);
        // order is not preserved , Duplicates not allowed.





    }


}
