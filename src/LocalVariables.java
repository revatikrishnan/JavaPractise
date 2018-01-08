interface ilocal{ // interface declaration have default access modifier by default
    int PI=4; //public static final by default
    void foo(); // public and abstract by default
}

public class LocalVariables implements ilocal{


    public static void main(String[] args) {
        final int x=1;
        LocalVariables.foo(x);
        System.out.println(PI);
    }
    
    public static void foo(final int x) {
        final String qwerty = "bar";
       
        System.out.println(qwerty);
      }

    @Override
    public void foo() {
        // TODO Auto-generated method stub
        
    }

}
