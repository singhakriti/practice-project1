package dec5Assignment;

public class SinglyLinkedList {
	 Node head;

	    class Node {
	        int data;
	        Node next;
	        Node(int d)
	        {
	          data = d;
	          next = null;
	        }
	    }

	    void deleteNode(int key)
	    {
	       
	        Node temp = head, prev = null;
	        if (temp != null && temp.data == key) {
	        	
	            head = temp.next;
	            return;
	        }
 
	        while (temp != null && temp.data != key) {
	            prev = temp;
	            temp = temp.next;
	        }

	        if (temp == null)
	            return;

	        prev.next = temp.next;
	    }

	   
	    public void push(int new_data)
	    {
	        Node new_node = new Node(new_data);
	        new_node.next = head;
	        head = new_node;
	    }

	    public void printList()
	    {
	        Node tnode = head;
	        while (tnode != null) {
	            System.out.print(tnode.data + " ");
	            tnode = tnode.next;
	        }
	    }

	public static void main(String[] args) {
		SinglyLinkedList Sllist = new SinglyLinkedList();

        Sllist.push(75);
        Sllist.push(13);
        Sllist.push(33);
        Sllist.push(26);

        System.out.println("Created Singly Linked List:");
        Sllist.printList();

       
        Sllist.deleteNode(13);

        System.out.println(
            "\nSingly Linked List after Deletion of 1:");
        Sllist.printList();

	}

}
