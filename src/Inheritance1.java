
 

class SuperClass{
    public static void display(){
        System.out.println("superClass");
    } 
    
}
class SubClass extends SuperClass{
    
    
    public static void display(){
        System.out.println("subclass");
    }
}

public class Inheritance1 {

    public static void main(String[] args) {
        SuperClass sup= new SuperClass();
        sup.display();
        SubClass sub=new SubClass();
            sub.display();    
        SuperClass su=new SubClass();
        su.display();
    }
}