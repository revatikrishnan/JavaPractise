package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;

public class FilesDemo {

    public static void main(String[] args) {
        
        
        
        try {
            System.out.println("Display all the files in a folder");
            Files.list(Paths.get("./config")).forEach(System.out::println);
            
            System.out.println("display all the files from current directory");
            Files.list(Paths.get(".")).filter(Files::isRegularFile).forEach(System.out::println);
            
            System.out.println("Display all xml files from config directory");
            
            Files.newDirectoryStream(Paths.get("./config"),path->path.toString().endsWith(".xml")).forEach(System.out::println);
            
            System.out.println("read from files using stream and Files");
            
            Stream<String> stream=Files.lines(Paths.get("./config/velocity.log"));
            stream.forEach(System.out::println);
            
            System.out.println("read from a file to a list with filters");
            Stream<String> stream1=Files.lines(Paths.get("./config/velocity.log"));
            List<String> list=new ArrayList<String>();
            list=stream1.filter(line -> line.startsWith("Wed Jun 29 17:30:31 EDT 2016  [debug] AvalonLogSystem initialized using logfile"))
            .map(String::toUpperCase).collect(Collectors.toList());
            list.forEach(System.out::println);
            
            System.out.println("Read from a file to a String");
            
            byte[] content=Files.readAllBytes(Paths.get("./config/config.properties"));
            String contentString=String.valueOf(content);
            System.out.println(contentString);
            
            System.out.println("Validate if two files contain the same content");
            
            System.out.println(FileUtils.contentEquals(new File("./config/login.xml"), new File("./config/logincopy.xml")));
            
            
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        

    }

}
