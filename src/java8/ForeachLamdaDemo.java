package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Predicate;

public class ForeachLamdaDemo {
    public static void main(String[] args) {
        
        HashMap<Integer, String> map=new  
                 HashMap<Integer, String>();
        
        map.put(10,"Amy");
        map.put(9,"Beena");
        map.put(11,"Charlie");
        map.put(2,"Dawn");
        
        map.forEach((id,name) -> {
            if(id%2==0)
                System.out.println(name);
        });
        
        List<String> names=Arrays.asList("Amy","Percy","Beena","George");
        names.forEach(name->System.out.println(name));
        
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        listThemOnCondition(list, n->n%2==0);
        listThemOnCondition(list, n->n%2!=0);
        System.out.println("total: "+sumAll(list, n->n%2==0));
    }
    
    public static void listThemOnCondition(List<Integer> numbers,Predicate<Integer> p){
        numbers.forEach(number->{
            
            if (p.test(number)) {
                System.out.println(number);
            }
        });
    }
    public static int sumAll(List<Integer> numbers, Predicate<Integer> p) {
        int total = 0;
        
        for(int n:numbers){
            if (p.test(n)) {
                total += n;
            }
        }
        
       /* //here variable total will give me error as i am trying to access it within and inner class and total is not a class variable
        // if we make total as class variable this error will be resolved
        numbers.forEach(number->{
            
            if (p.test(number)) {
                total += number;
            }
        });*/
        
        
        return total;
    }
}
