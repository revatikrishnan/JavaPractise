package com.streamExample;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

    public static void main(String[] args) {
        //Add all the numbers in the list
        List<Integer> numbers=Arrays.asList(1,2,3,4);
        
        int sum=numbers.stream().reduce(0,(num1,num2)->num1+num2);
        System.out.println(sum);
        
        numbers.replaceAll(n->n+10);
        
        sum=numbers.stream().reduce(0,Integer::sum);
        System.out.println(sum);
        
        String[] myArray = { "this", "is", "a", "sentence" };
        String result = Arrays.stream(myArray)
                        .reduce("", (a,b) -> a +" " +b);
        System.out.println(result.trim());
        
        
        
    }

}
