package assistedPractice;

import java.util.HashMap;
import java.util.Map;

public class ImplimentationOfMaps {

	public static void main(String[] args) {
		Map<String, Integer> maps = new HashMap<>();
		maps.put("One", 1);
        maps.put("Two", 2);
        System.out.println("Map: " + maps);

        
        System.out.println("Keys: " + maps.keySet());

        
        System.out.println("Values: " + maps.values());

        
        System.out.println("Entries: " + maps.entrySet());

       
        int value = maps.remove("One");
        System.out.println("Removed Value: " + value);


	}

}
