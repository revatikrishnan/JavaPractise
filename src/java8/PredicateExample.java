package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
public static void main(String[] args) {

List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
System.out.println("Display even numbers from the list");
listThemOnCondition(list, n->n%2==0);
System.out.println("Display odd numbers from the list");
listThemOnCondition(list, n->n%2!=0);
System.out.println("Display numbers greater than 5 from the list");
listThemOnCondition(list, n-> n>5);
System.out.println("Display all nunbers from the list");
listThemOnCondition(list, n-> true);

}

public static void listThemOnCondition(List<Integer> numbers,Predicate<Integer> p){
    numbers.forEach(number->{
    if (p.test(number)) {
    System.out.print(number+" ");
    }
    });
    System.out.println();
}
}