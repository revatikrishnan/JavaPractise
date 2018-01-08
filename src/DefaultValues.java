
public class DefaultValues {

    byte b;
    short s;
    int i;
    long l;
    char c='A';
    float f;
    double d;
    boolean boo;
    String str;
    
    void display(){
        System.out.println("Default values: ");
        System.out.println(b); //default value for number types 0
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c); //default value of char is \u0000
        System.out.println(f); // default value for float types 0.0
        System.out.println(d);
        System.out.println(boo); //default for boolean false
        System.out.println(str); //default for object types null
        System.out.println(97);
    }
    public static void main(String[] args) {
        
        new DefaultValues().display();
        
        // code to convert charater to ascii
        
        char first='a';
        
        System.out.println("The ascii value of character '"+first+"' is "+ ((int)first));
        
        // code to convert ascii to character
        
        int second=65;
        
        System.out.println("The chacter value of ascii number '"+second+"' is "+ ((char)second));

    }

}
