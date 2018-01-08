package com.streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StreamDistinct {

    public static void main(String[] args) {
        
        //with Simple types
        List<String> alphabets=Arrays.asList("A", "B", "C", "D", "A", "B", "C");

        List<String> uniquealpha=alphabets.stream().distinct().collect(Collectors.toList());
        uniquealpha.forEach(a->System.out.println(a));
        
        //with class types
        Person lokesh = new Person(1, "Lokesh", "Gupta");
        Person brian = new Person(2, "Brian", "Clooney");
        Person alex = new Person(3, "Alex", "Kolen");
        Person ross = new Person(1, "Mike", "Ross");
        
        List<Person> persons=Arrays.asList(new Person[] {lokesh,brian,alex,ross,brian,alex});
        
        List<Person> personsDis=persons.stream().filter(distinctByKey(p -> p.getId())).collect(Collectors.toList());
        personsDis.forEach(System.out::println);
    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, Object> keyExtractor) 
    {
        Map<Object, Boolean> map = new ConcurrentHashMap<>();
        return t -> map.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}