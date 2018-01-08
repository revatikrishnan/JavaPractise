package Algorithms;

public class Factorial {

    public static int factorial(int n){
        if(n==0||n==1)
            return 1;
        else 
            return n*factorial(n-1);
            
    }
    
    public static void main(String[] args) {
        //using recursion
        int n=6;
        int fact=factorial(n);
        System.out.println(fact);

        //using logic
        int f=1;
        for(int i=n;i>=1;i--){
            f=f*i;
        }
        System.out.println(f);
    }
}
