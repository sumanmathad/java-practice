package collections.maps;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class HashMapClass {
    /*
       * Map interface is not a child of Collection
       * key-value pairs(Entries)  -- no duplicate keys however values can be duplicate
       * Insertion order is not preserved. (Internal underlying datastructure is Hashtable)
       * null allowed once , multiple null values can be added
       * Best for search Operations
    */

    @Test
    public void hashmapDefn(){
        HashMap hm = new HashMap();

        hm.put("text",0);
        hm.put(1,true);
        System.out.println(hm);

    }

    @Test
    public void hashmapdata(){
        HashMap hm = new HashMap();

        hm.put("text",0);
        hm.put(1,true);


    }

    @Test
    public void hashmapMethods(){
        HashMap<Integer,String> hm = new HashMap<> (Map.of(1,"one",2,"two",3,"Three"));
        System.out.println("Initital state = "+hm);

        System.out.println("isEmpty() = "+hm.isEmpty());
        System.out.println("size() = "+hm.size());
        System.out.println("entrySet() = "+hm.entrySet());
        System.out.println("keySet() = "+hm.keySet());




    }



}
