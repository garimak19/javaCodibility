import java.util.Iterator;
import java.util.LinkedList;

public class DequeueLinkedList {

	static LinkedList<Integer> deq;
	static void insertAtFront(int el) {
		deq.addFirst(el);
	}
static void insertAtRear(int el) {
		deq.addLast(el);
	}
static void deleteAtFront() {
	deq.removeFirst();
}
static void deleteAtRear() {
	deq.removeLast();
	
}
static void printDeq() {
	Iterator it=deq.listIterator();
	System.out.println();
	while(it.hasNext()) {
		System.out.print(it.next()+" ");
	}
	
}
	public static void main(String[] args) {
		deq=new LinkedList<Integer>();
		DequeueLinkedList list=new DequeueLinkedList();
		list.insertAtFront(10);
		
		list.insertAtFront(20);
		
		list.insertAtRear(30);
		
		list.insertAtRear(40);
		list.printDeq();
		list.deleteAtFront();
		list.printDeq();
		list.deleteAtRear();
		list.printDeq();
		
		
	}

}
