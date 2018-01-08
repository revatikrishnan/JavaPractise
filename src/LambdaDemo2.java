
@FunctionalInterface
interface HelloWorld {
        
        public void greetSomeone(String someone);
    }

public class LambdaDemo2 {

    public static void main(String[] args) {
        
        
        //anonymous class
        HelloWorld h=new HelloWorld() {
            
            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hello "+someone+" ");
                
            }
        };
        
        //lamda expression that replaces anonymous class and its cumbersome code in java 8
        HelloWorld hw=someone ->  System.out.println("Hello "+someone+" "); ;
        hw.greetSomeone("Revati");
        
        h.greetSomeone("Subbu");
    }
 



}
