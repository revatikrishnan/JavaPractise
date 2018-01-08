package com.streamExample;

import java.util.Arrays;
import java.util.List;

public class MaxAndMin {

    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9,10,435,4636,2,52,526});
        
        Integer max=numbers.stream().max(Integer::compare).get();
        System.out.println(max);
        
        Integer min=numbers.stream().min((e1,e2) -> Integer.compare(e1, e2)).get();
        System.out.println(min);
    }

}