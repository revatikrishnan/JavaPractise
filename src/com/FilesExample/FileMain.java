package com.FilesExample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

import junit.framework.AssertionFailedError;
import junit.framework.ComparisonFailure;
import net.sf.json.test.JSONAssert;

public class FileMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            /*Files.list(Paths.get("./config"))
            .forEach(System.out::println);
            
            Files.list(Paths.get("."))
            .filter(Files::isRegularFile)
            .forEach(System.out::println);
            
            Files.newDirectoryStream(Paths.get("./config"),
                    path -> path.toString().endsWith(".xml"))
                    .forEach(System.out::println);
            
            //reading from a file using files
            //Stream<String> stream=Files.lines(Paths.get("<filepath>"));
            //stream.forEach(System.out::println);
            
            //read from a file to a list
            Stream<String> stream=Files.lines(Paths.get("<filepath>"));
            List<String> list = new ArrayList<String>();
            list = stream
                        //.filter(line -> !line.startsWith("Line3"))
                        //.map(String::toUpperCase)
                        .collect(Collectors.toList());
            list.forEach(System.out::println);*/
            
            //read from a file to a string
            String content = new String(Files.readAllBytes(Paths.get("<filepath>")));
            System.out.println("content:"+content);
            
            System.out.println(FileUtils.contentEquals(new File("<filepath>"), new File("./config/bdperson-test1.avro")));
//          List<String> strings=Arrays.asList("ABC|EK||EK|", "|EK|", "C", "D", "|EK|", "B", "C");
//          long numberOfEK=strings.stream().filter(s->s.contains("|EK|")).count();
//          System.out.println(numberOfEK);
            
            try {
            String content1 = new String(Files.readAllBytes(Paths.get("<filepath>")));
            String content2 = new String(Files.readAllBytes(Paths.get("<filepath>")));
            JSONAssert.assertJsonEquals(content1, content2);
            
            
            }
            catch (ComparisonFailure e) {
                System.out.println(e.getMessage());
            }
            catch (AssertionFailedError e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
