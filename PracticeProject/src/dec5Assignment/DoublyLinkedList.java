package dec5Assignment;



public class DoublyLinkedList {

	Node head;
	Node tail;

	public DoublyLinkedList(){
		 this.head = null; 
	     this.tail = null;
	 }
	
	public void insertAtBeginning(int data) {
		Node temp = new Node(data); 
	    if (head == null) { 
	        head = temp; 
	        tail = temp; 
	    } 
	    else { 
	        temp.setNext(head); 
	        head.setPrev(temp);
	        head = temp; 
	    }
	}
	
	public void insertAtEnd(int data) {
		Node temp = new Node(data); 
	    if (tail == null) { 
	        head = temp; 
	        tail = temp; 
	    } 
	    else { 
	        tail.setNext(temp); 
	        temp.setPrev(tail);
	        tail = temp; 
	    }
	}
	
	public void insertAtPosition(int data, int position) 
	{ 
	    Node temp = new Node(data); 
	    if (position == 1) { 
	        insertAtBeginning(data); 
	    } 
	    else { 
	        Node current = head; 
	        int currPosition = 1; 
	        while (current != null && currPosition < position) { 
	            current = current.getNext(); 
	            currPosition++; 
	        } 
	        if (current == null) { 
	            insertAtEnd(data); 
	        } 
	        else { 
	            temp.setNext(current);
	            temp.setPrev(current.getPrev());
	            current.getPrev().setNext(temp); 
	            current.setPrev(temp);
	        } 
	    } 
	}
	
//	traverse from head to tail
	public void traverseForward(){ 
	    Node current = head; 
	    while (current != null) { 
	        System.out.print(current.getData() + " "); 
	        current = current.getNext(); 
	    } 
	} 
	
	// Traversing from tail to the head 
	public void traverseBackward() { 
	    Node current = tail; 
	    while (current != null) { 
	        System.out.print(current.getData() + " "); 
	        current = current.getPrev(); 
	    } 
	}
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertAtBeginning(10);
		dll.insertAtEnd(15);
		dll.insertAtPosition(20, 2);
		dll.insertAtBeginning(25);
		
		dll.traverseForward();
		System.out.println();
		dll.traverseBackward();
	}
} 

	


