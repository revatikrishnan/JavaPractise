package com.streamExample;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFilter {

    public static String keyitem;
    public static void main(String[] args) {
        Map<Integer, String> HOSTING = new HashMap<Integer, String>();
        HOSTING.put(1, "linode.com");
        HOSTING.put(2, "heroku.com");
        HOSTING.put(3, "digitalocean.com");
        HOSTING.put(4, "aws.amazon.com");
        
        for(Map.Entry<Integer,String> map:HOSTING.entrySet()) {
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }
        
        //display the value from the map that contains specific substring
        String value=HOSTING.entrySet().stream().
                filter(item -> item.getValue().contains("aws")).
                map(Map.Entry::getValue).
                collect(Collectors.joining());
        
        
        System.out.println(value);
        
        //display the key from the map that contains specific substring
        HOSTING.entrySet().stream().
                filter(item -> item.getValue().contains("aws")).
                map(Map.Entry::getKey).forEach(e ->{
                    System.out.println(e);
                });

        //foreach for map items display
        Map<String, Integer> items = new HashMap<>();
        items.put("C", 45);
        items.put("B", 20);
        items.put("A", 3);
        items.put("E", 4664);
        items.put("F", 6);
        items.put("D",  764);
        
        Stream<Integer> set=items.entrySet().stream().filter(item -> item.getKey().equals("F")||item.getKey().equals("A")).map(Map.Entry::getValue);
        set.forEach(System.out::println);
        
        //sum of all the values of this map
        int sum=items.values().stream().reduce(0,(num1,num2)->num1+num2);
        
        //sum of the values of certain keys in the map
        int sumof=items.entrySet().stream().filter(item -> item.getKey().equals("F")||item.getKey().equals("A")).map(Map.Entry::getValue).mapToInt(Number::intValue).sum();
        System.out.println("sumof: "+sumof);
        int sum2=items.values().stream().mapToInt(Number::intValue).sum();
        System.out.println("SUM:"+sum2);
        System.out.println("SUM:"+sum);
        
        items.forEach((k,v)->{
            //System.out.println(k);
            //System.out.println(v);    
        });
        
        /*String key;
        
        for(Map.Entry<String, Integer> entry:items.entrySet()) {
            key=entry.getKey();
        }*/
        
        //sort the map in ascending order of value
        Stream<Entry<String, Integer>> entry=items.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue));
        entry.forEach(e->{
            System.out.println(e.getValue() +" "+e.getKey());
        });
        System.out.println();
        
        //sort the map in ascending order of Key
        items.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(e->{
            System.out.println(e.getValue() +" "+e.getKey());
        });
    }

}