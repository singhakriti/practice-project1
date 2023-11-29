package assistedPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("pract*ce", "practice"));
	        
	        System.out.println(Pattern.matches("P*ractice*", "PracticeProject"));
	        System.out.println(Pattern.matches("[a-z]", "g"));
	        
	        System.out.println(
	            Pattern.matches("[a-zA-Z]", "g"));
	        
	        Pattern pattern = Pattern.compile("Organic");
	        Matcher m = pattern.matcher("Organic.org");
	        while (m.find())
	        	 
	           
	            System.out.println("Pattern found from "
	                               + m.start() + " to "
	                               + (m.end() - 1));

	}

}
