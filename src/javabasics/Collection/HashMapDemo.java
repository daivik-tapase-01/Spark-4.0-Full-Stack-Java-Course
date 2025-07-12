package javabasics.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        // duplicate keys are not allowed
        // order not preserve
        Map<String,Integer> map = new HashMap<>();
        map.put("one",10);
        map.put("two",20);
        map.put("three",30);
        map.put("four", 40);

        map.put(null,4);
        map.put(null,50);
        // null allowed at once only because duplicate keys not allowed

        System.out.println(map.get("one"));
        System.out.println(map.get(null));

        if(map.containsKey("two")){
            System.out.println(map.get("two"));
        }

        System.out.println("--------------------");
        // fetch all keys
        for(String data: map.keySet()){
            System.out.println(data + " : " + map.get(data));
        }

        // fetch all values
        for(Integer value: map.values()){
            System.out.println("value: " +value);
        }

        System.out.println("--------------------");
        // entry
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println("key: " + entry.getKey() + " value: "+ entry.getValue());
        }

        System.out.println("--------------------");
        // java8
        map.forEach((key,value)->{
            System.out.println("key: "+ key + " ----> value: "+ value);
        });

    }
}
