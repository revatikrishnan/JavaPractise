import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExampleValidEmai {

    public static void main(String[] args) {
        Pattern pattern = 
                Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

                Matcher matcher = 
                pattern.matcher("KnappAet.com");

                boolean found = false;
                while (matcher.find()) {
                    System.out.println("Valid Email");
                    found = true;
                }
                if(!found){
                    System.out.println("Invalid email");
                }

    }

}
