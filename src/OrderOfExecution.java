
public class OrderOfExecution {
 static int a;
 
    static{
        
        System.out.println(a=9);
        System.out.println("helo");
        
            new StaticBlock();
        
        
    }
    public static void main(String[] args) {
        a=10;
        System.out.println(a);

    }

}
