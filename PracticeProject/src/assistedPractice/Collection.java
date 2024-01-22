package assistedPractice;
import java.util.*;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); 
		list.add("Pooja"); 
		list.add("Vinay");  
		list.add("Pooja");  
		list.add("Sheema");  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  

	}
 }
}
