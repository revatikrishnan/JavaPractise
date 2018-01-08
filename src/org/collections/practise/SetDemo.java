package org.collections.practise;

import java.util.ArrayList;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> names=new TreeSet<String>();
        names.add("selenium");
        names.add("protractor");
        names.add("sahi pro");
        names.add("sahi pro");
        names.add("watir");
        names.add("testcomplete");
        names.add("testingwhiz");
        
        for (String n : names) {
            System.out.println(n);
        }
    
    }

}