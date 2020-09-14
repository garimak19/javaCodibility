import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyStack {
	
	static List<Integer> stack;
	void push(Integer el) {
		stack.add(el);
	}
	
	void pop() {
		stack.remove(stack.size()-1);
	}
	void peek() {
		System.out.println(stack.get(stack.size()-1));
	}
	void printStack() {
		Iterator it=stack.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		 stack=new LinkedList<Integer>();
		MyStack ms=new MyStack();
		ms.push(10);
		ms.push(20);
		ms.push(30);
		ms.push(40);
		ms.push(50);
		ms.push(60);
		System.out.println("Elements at stack ");
		ms.printStack();
		System.out.println("Peek Element ");
		ms.peek();
		
		ms.pop();
		System.out.println("Elements at stack after pop ");
		ms.printStack();

	}

}
