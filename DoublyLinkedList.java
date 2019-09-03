class Nodes{
	Nodes next;
	Nodes prev;
	int data;
	public Nodes(int data) {
		this.data = data;
	}
}
/* This class implements  a doubly linked list
 * Author - Vivek Sharma 
 * Date - 9/3
 */
public class DoublyLinkedList {
	    Nodes ptr;
	    Nodes start =null;
	    Nodes last =null;
		public void addData(int data) {
			// add the first element to the list
			if(start == null) {
				start = new Nodes(data);
				ptr = start;
				ptr.prev =null;
			}
			else {
				ptr.next = new Nodes(data);
				last =ptr.next;
				last.prev = ptr;
				ptr = ptr.next;
			}
		}
		public void dispalyList() {
			//if list is empty
			if(start ==null) {
				System.out.println("List is empty");
			}
			ptr = start;
			while(ptr!=null) {
				System.out.println(ptr.data);
				ptr = ptr.next;
			}
		}
	
	public static void main(String[] args) {
		DoublyLinkedList st = new DoublyLinkedList();
		st.addData(1);
		st.addData(7);
		st.addData(3);
		st.addData(2);
		st.addData(5);
		st.dispalyList();

	}

}
