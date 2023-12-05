package dec5Assignment;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
       Queue q1=new PriorityQueue();
		
		Queue q2=new LinkedList();
		q1.add(18);q1.add(4);q1.add(25);q1.add(10);q1.add(14);
		q2.add(18);q2.add(4);q2.add(25);q2.add(10);q2.add(14);
		System.out.println(q1);
		System.out.println(q2);
		System.out.println("Remove "+q1.poll());
		System.out.println("Remove "+q2.poll());
		System.out.println(q1);
		System.out.println(q2);
	}

}
