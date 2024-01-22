package dec5Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourthSmallestElement {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(89);
		intList.add(56);
		intList.add(13);
		intList.add(21);
		intList.add(65);
		intList.add(29);
		intList.add(34);
		intList.add(10);
		
		System.out.println("list before sorting: " +intList);
		Collections.sort(intList);
		System.out.println("list after sorting: " +intList);
		System.out.println("4th smallest element is: " + intList.get(3));

	}

}
