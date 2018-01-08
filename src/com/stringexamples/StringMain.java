package com.stringexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class StringMain {

	public static void main(String[] args) {
		//chars creates a stream for all characters of the string, so you can use stream operations upon those characters
		String str="foobar:foo:bar"
	    .chars()
	    .distinct()
	    .mapToObj(c -> String.valueOf((char)c))
	    .sorted()
	    .collect(Collectors.joining());

		System.out.println(str);
		
		
		//This method can be used to join multiple strings which are noy yet in form of collection or array
		String joinedString = String.join(", ", "How", "To", "Do", "In", "Java");
		System.out.println(joinedString);
		
		//This method is used to join array or list of strings
		List<String> strList = Arrays.asList("How", "To", "Do", "In", "Java");
        
		joinedString = String.join(", ", strList);
		System.out.println(joinedString);
		
		//string occurences
		
		
		//int countmatch=StringUtils.countMatches(str1,"|EK|");
		//System.out.println(countmatch);
	}

}

