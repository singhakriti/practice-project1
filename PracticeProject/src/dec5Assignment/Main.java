package dec5Assignment;

public class Main {
	public static void main(String[] args) {
    	CircularLinkedList list = new CircularLinkedList();
        list.insert(3);
        list.insert(8);
        list.insert(5);
        list.insert(2);
 
        System.out.println("Sorted Circular Linked List:");
        list.display();

}

}
