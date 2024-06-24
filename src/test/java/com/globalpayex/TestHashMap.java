package com.globalpayex;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;


public class TestHashMap {

    @Test
    void testMap1(){
        HashMap<Integer,String> map=new HashMap<>();
        assertEquals(0,map.size());

        //add entry
        map.put(10,"pranjal");
        map.put(11,"nisha");
        assertEquals(2,map.size());

        //get entry
        assertEquals("pranjal",map.get(10));

        //update
        map.put(11,"shubham");
        assertEquals("shubham",map.get(11));

        //delete entry
        map.remove(10);
        assertEquals(1,map.size());

        //get a list
        var values=map.values();
        System.out.println(values);
        var keys=map.keySet();
        System.out.println(keys);

    }
}
