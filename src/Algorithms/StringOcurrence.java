package Algorithms;

public class StringOcurrence {

    public static void main(String[] args) {
        String str="ABCDEFCDGHIJCDKLMNCD";
        
        String substring="CD";
        
        str=str.replaceAll(substring, ";");
        
        System.out.println(str.split(";").length);
        
        str="ABCDEFCDGHIJCDKLMNCD";
        str = str.toLowerCase();
        int count = 0;
        for (int i = str.indexOf("cd"); i >= 0; i = str.indexOf("cd", i + 1))
            count++;
        
        System.out.println(count);

    }

}
