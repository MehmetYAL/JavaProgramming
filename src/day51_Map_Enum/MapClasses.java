package day51_Map_Enum;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");

// it accecpts one key only time, when we use same key it will replace last one eith the previous one
        System.out.println(hashMap);


        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();

        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");//there is same key in follwing
        linkedHashMap.put(5, "Isabella");// same key(5) as previous so removes the previous one
        linkedHashMap.put(null, "Hulya");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer,String> treeMap=new TreeMap<>(); // sorted keys doesn'n supoort null
        // key can not be null, but value can be null

        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
        treeMap.put(7, null);

        System.out.println("treeMap = " + treeMap);

        Map<Integer,String> hashtable=new Hashtable<>();//key an value can not be null

        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        //hashtable.put(6, null);

        System.out.println("hashtable = " + hashtable);
    }
}
