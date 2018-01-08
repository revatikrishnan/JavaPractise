package lambdasAndStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainClass {

    public static void main(String[] args) {
        List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };
 
        List<Person> phpProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
                add(new Person("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
                add(new Person("Victor", "Channing", "PHP programmer", "male", 32, 1600));
                add(new Person("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
                add(new Person("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
                add(new Person("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
                add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
                add(new Person("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
                add(new Person("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
                add(new Person("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
            }
        };

        Consumer<Person> print=(p) -> System.out.println(p.getFirstName()+" "+ p.getLastName()+" "+p.getSalary());
        System.out.println("Show programmers names:");
        System.out.println("Java Programmers");
        System.out.println("----------------");
        javaProgrammers.forEach(print);
        System.out.println();
        System.out.println("PHP Programmers");
        System.out.println("---------------");
        phpProgrammers.forEach(print);
        
        
        System.out.println("Increase salary by 5% to programmers:");
        Consumer<Person> giveRaise = e ->{
            e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());
        };
        
        System.out.println("JAVA"); 
        javaProgrammers.forEach(giveRaise);
        javaProgrammers.forEach(print);
        System.out.println("PHP");
        phpProgrammers.forEach(giveRaise);
        phpProgrammers.forEach(print);
        
       System.out.println("PHP programmers who earn more than 1400");
       
       Predicate<Person> whoEarnMoreThan1400= p -> (p.getSalary()>1400);
       phpProgrammers.
       stream().filter(whoEarnMoreThan1400).forEach(print);
       
       System.out.println("PHP sorted");
       phpProgrammers.sort(new Comparator<Person>() {

        @Override
        public int compare(Person o1, Person o2) {
            if(o1.getSalary()-o2.getSalary()==0){
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
            return o1.getSalary()-o2.getSalary();
        }
           
       });
       
       phpProgrammers.sort(new Comparator<Person>() {

           @Override
           public int compare(Person o1, Person o2) {
               if(o1.getSalary()-o2.getSalary()==0){
                   return o1.getFirstName().compareTo(o2.getFirstName());
               }
               return o1.getSalary()-o2.getSalary();
           }
              
          });
       
       phpProgrammers.forEach(print);
    }

}
