package com.lambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.streamExample.Person;

public class CollectionSort {

    public static void main(String[] args) {
        
        //sorting list of strings
        List<String> names=Arrays.asList(new String[] {"Mahesh","Suresh","Ramesh","Naresh","Kalpesh"});
        Collections.sort(names);
        names.forEach(System.out::println);
        System.out.println();
        
        //sorting list of numbers
        List<Integer> numbers=Arrays.asList(new Integer[] {23425,464,14,65,4,2,1,3});
        Collections.sort(numbers);
        numbers.forEach(System.out::println);
        System.out.println();
        
        Person lokesh = new Person(2, "Lokesh", "Gupta");
        Person brian = new Person(1, "Brian", "Clooney");
        Person alex = new Person(4, "Alex", "Kolen");
        Person ross = new Person(3, "Mike", "Ross");
        
        List<Person> persons=Arrays.asList(new Person[] {lokesh,brian,alex,ross});
        persons.forEach(System.out::println);
        System.out.println();
        
        //method one - use sort method of the list object and lambda
        persons.sort((o1,o2) -> o1.getFname().compareTo(o2.getFname()));
        persons.forEach(System.out::println);
        System.out.println();
        
        //method two - use sort method of the Collections object and lambda
        Collections.sort(persons, (o1,o2) -> o1.getId().compareTo(o2.getId()));
        persons.forEach(System.out::println);
        System.out.println();
        
        //method three - use stream's sorted method with the lambda expression
        List<Person> sortedpersons=persons.stream().sorted((p1,p2) -> p1.getLname().compareTo(p2.getLname())).collect(Collectors.toList());
        sortedpersons.forEach(System.out::println);
        
       
    }

}
