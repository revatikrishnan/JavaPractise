
public class StringDemo {

    public static void main(String[] args) {
        String s1 = new String(); //empty string 
                 char chars[] = { 'h', 'e', 'l', 'l', 'o'}; 
                 String s2 = new String(chars); //s2="hello"; 
                 byte bytes[] = { 'w', 'o', 'r', 'l', 'd' }; 
                 String s3 = new String(bytes); //s3="world" 
                 String s4 = new String(chars, 1, 3);
                 String s5 = new String(s2); 
                 String s6 = s2; 
                 String s10=new String("hello");
                 System.out.println(s1); 
                 System.out.println(s2); 
                 System.out.println(s3); 
                 System.out.println(s4); 
                 System.out.println(s5); 
                 System.out.println(s6); 
                 System.out.println(s2.equals(s6));
                 System.out.println(s2.equals(s10));
                 System.out.println(s2==s6);
                 System.out.println(s2==s10);
                 
                 
                 Boolean b = true;
                 String str = String.valueOf(b);
                 Boolean b1 = true;
                 String str1 = b1.toString();

    }

}
