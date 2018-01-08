package java8;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@FunctionalInterface
interface IMath{
    int operate(int a,int b);
    
    default String getTodayDate(){
        Calendar cal=Calendar.getInstance();
        return new SimpleDateFormat("dd-mm-yyyy").format(cal.getTime());
    }
    
    static void show(){
        System.out.println("This is static method inside IMath interface");
    }
}

class Maths implements IMath{

    @Override
    public int operate(int a, int b) {
        return Math.max(a, b);
    }
    
}
public class MathOperations {

    public static void main(String[] args) {
        IMath add=(a,b) -> a+b;
        IMath sub=(a,b) -> a-b;
        IMath mul=(a,b) -> a*b;
        IMath div=(a,b) -> a/b;
        int first=20;
        int second=10;
       // System.out.println(operate((a,b) -> a+b,10,20));
        System.out.println("Sum of "+first+" and "+second+" is "+(first+second));
        System.out.println(operate(add,first,second));
        System.out.println(operate(sub,first,second));
        System.out.println(operate(mul,first,second));
        System.out.println(operate(div,first,second));
        
        // calling the default method of the interface
        System.out.println(add.getTodayDate());
        
        /*
         * Note: When you implement an interface that contains a static method, the static method is still part of the interface and not part of the implementing class. For this reason, you cannot prefix the method with the class name. Instead, you must prefix the method with the interface name
         */
        IMath.show();
        // Maths.show(); // wont compile
    }
   
   static int operate(IMath m,int a,int b){
        return m.operate(a, b);
    }
}
