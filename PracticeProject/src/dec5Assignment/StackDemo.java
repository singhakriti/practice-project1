package dec5Assignment;

import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		Stack ss=new Stack();

		ss.push(100);
		ss.push(200);
		ss.push(300);
		ss.push(500);
		
		System.out.println("Insert the elements");
	

    	System.out.println(ss);
		System.out.println("Remove "+ss.pop());
		System.out.println(ss);

	}

}
