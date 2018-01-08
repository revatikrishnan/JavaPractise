package org.collections.practise;


import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<Integer, String> students=new HashMap<Integer, String>();
        students.put(1, "meena");
        students.put(2, "heena");
        students.put(3, "neena");
        students.put(4, "fatima");
        students.put(5, "jaya");
        
        Map<Integer, String> teachers=new LinkedHashMap<Integer, String>();
        
        
        for(Map.Entry<Integer,String> each:students.entrySet()) {
            System.out.println(each.getKey());
            System.out.println(each.getValue());
        }
        
        
        
        SortedSet<Map.Entry<Integer, String>> set=new TreeSet<Map.Entry<Integer, String>>(new Comparator<Map.Entry<Integer, String>>() {

            @Override
            public int compare(Entry<Integer, String> arg0, Entry<Integer, String> arg1) {
                return arg0.getValue().compareTo(arg1.getValue());
            }

        });
        
        set.addAll(students.entrySet());
        
        set.forEach(e -> System.out.println(e.getKey() +" "+e.getValue()));
    }

}