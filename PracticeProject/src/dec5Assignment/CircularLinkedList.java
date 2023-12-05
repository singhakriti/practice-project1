package dec5Assignment;
class CircularNode {
	  int data; 
	  CircularNode next;
	  CircularNode(int data) {
	    this.data = data;
	    this.next = null;
	  }
	}


public class CircularLinkedList {
	
		 CircularNode head; 
	
		  
		    // Constructor 
		 CircularLinkedList() {
		        head = null;
		    }
		 
		    void insert(int newData) {
		        CircularNode newNode = new CircularNode(newData);
		        CircularNode current = head;
		 
		        if (current == null) {
		            newNode.next = newNode;
		            head = newNode;
		        } else if (current.data >= newNode.data) {
		            while (current.next != head) {
		                current = current.next;
		            }
		            current.next = newNode;
		            newNode.next = head;
		            head = newNode;
		        } else {
		            while (current.next != head && current.next.data < newNode.data) {
		                current = current.next;
		            }
		            newNode.next = current.next;
		            current.next = newNode;
		        }
		    }
		 
		    void display() {
		        CircularNode temp = head;
		        if (head != null) {
		            do {
		                System.out.print(temp.data + " ");
		                temp = temp.next;
		            } while (temp != head);
		        }
		        System.out.println();
		    }
		}
		 
		
		    


