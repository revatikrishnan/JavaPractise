import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingURL {

    public static void main(String[] args) {
       

       String phone="+1 (566)-790-0787";

       if((phone.length()<=30) && phone.matches("[+#()\\-0-9 ]+")){
           System.out.println("valid");
       }else
           System.out.println("invalid");

       
    }

}
