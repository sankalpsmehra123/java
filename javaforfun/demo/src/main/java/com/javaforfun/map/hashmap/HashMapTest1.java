package com.javaforfun.map.hashmap;


import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapTest1 {
    public static void main(String[] args) {
        HashMap<Integer, String>  hashmap = new HashMap<Integer, String>();
        hashmap.put(1, "sankalp");
        hashmap.put(2, "ayush");
        hashmap.put(3, "bhaskar");
        hashmap.put(4, "abhishek");
        System.out.println(hashmap);
        
        Set<Integer> intSet = hashmap.keySet();
        System.out.println(intSet);

        Set<Entry<Integer, String>> entrySet = hashmap.entrySet();
        System.out.println(entrySet);

         for (Entry<Integer, String> entry: hashmap.entrySet()){
            System.out.println(entry);
         }

    }
}
