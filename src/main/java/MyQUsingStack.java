import java.util.Iterator;
import java.util.Stack;

public class MyQUsingStack {
static Stack<Integer> q;
	
	static void enqueue(int ele) {
		q.push(ele);
	}
	static void dequeue() {
		q.remove(0);
	}
	static void display() {
			Iterator it=q.iterator();
			
			while(it.hasNext()) {
				System.out.print(it.next()+" ");
			}
			System.out.println();
	}
	static void peek() {
		System.out.println(q.get(0));
	}
	public static void main(String[] args) {
		q=new Stack<Integer>();
		MyQUsingStack myq=new MyQUsingStack();
		myq.enqueue(10);
		myq.enqueue(20);
		myq.enqueue(30);
		myq.enqueue(40);
		myq.enqueue(50);
		myq.display();
		myq.dequeue();
		myq.display();
		
		myq.peek();
	}

}
