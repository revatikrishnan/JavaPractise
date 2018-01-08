package comparableExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Employee> emp=new ArrayList<Employee>();
        
        emp.add(new Employee(1, "revati", "100000"));
        emp.add(new Employee(4, "subbu", "100000"));
        emp.add(new Employee(3, "radhakrish", "100000"));
        emp.add(new Employee(2, "chaya", "100000"));
        
        
        
        emp.forEach(e->System.out.println(e.getEmpfname()));
        
        Collections.sort(emp);
        
        emp.forEach(e->System.out.println(e.getEmpfname()));
        
        Collections.sort(emp, new Comparator<Employee>() {

            @Override
            public int compare(Employee o1, Employee o2) {
                // TODO Auto-generated method stub
                Integer i1=new Integer(o1.getEmpid());
                Integer i2=new Integer(o2.getEmpid());
                return i1.compareTo(i2);
            }});
        
        emp.forEach(e->System.out.println(e.getEmpid()+" "+e.getEmpfname()));
        
 Set<Integer> s1=new HashSet<Integer>();
        
        s1.add(45);
        s1.add(2);
        s1.add(23);
        s1.add(23);
        s1.add(90);
        s1.forEach(i->System.out.println(i));
        
 Set<Integer> s2=new LinkedHashSet<Integer>();
        
        s2.add(45);
        s2.add(2);
        s2.add(23);
        
        s2.forEach(i->System.out.println(i));
        
        Set<Integer> s=new TreeSet<Integer>();
        
        s.add(45);
        s.add(2);
        s.add(23);
        
        s.forEach(i->System.out.println(i));
        
        
        HashMap<Integer, String> map=new HashMap<Integer,String>();
        map.put(1, "revati");
        map.put(3, "subbu");
        map.put(0, "chaya");
        map.put(56, "rk");
        map.put(null, "rkiyer");
        System.out.println(map);
        
        LinkedHashMap<Integer, String> map2=new LinkedHashMap<Integer,String>();
        map2.put(1, "revati");
        map2.put(3, "subbu");
        map2.put(0, "chaya");
        map2.put(56, "rk");
        System.out.println(map2);
        
        TreeMap<Integer, String> map3=new TreeMap<Integer,String>();
        map3.put(1, "revati");
        map3.put(3, "subbu");
        map3.put(0, "chaya");
        map3.put(56, "rk");
        System.out.println(map3);
        
        Set<Map.Entry<Integer, String>> emps=map3.entrySet();
        
        emps.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
        
        SortedSet<Map.Entry<Integer, String>> set=new TreeSet<Map.Entry<Integer, String>>((o1,o2)->o1.getValue().compareTo(o2.getValue()));
        set.addAll(map3.entrySet());
        set.forEach(svalue->System.out.println(svalue.getKey()+" "+svalue.getValue()));
    }

}
