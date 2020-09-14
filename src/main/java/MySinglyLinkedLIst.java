import java.util.Scanner;


public class MySinglyLinkedLIst {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Node head =null;
		
		System.out.println(" how many nodes ");
		int n=scanner.nextInt();
		while(n-->0) {
			int ele=scanner.nextInt();
			head=insert(head,ele);
			
		}
		display(head);
		removeElement(head, 3);
		display(head);
		scanner.close();

	}
	
	public static void display(Node head) {
		Node start=head;
		System.out.println();
		while(start!=null ) {
			System.out.print(start.data+" ");
			start=start.next;
			
		}
	}
	public static void removeElement(Node head,int data) {
		Node start=head, prev=null;
		
		
		while(start!=null && start.data!=data) {
			prev=start;
				start=start.next;
			}
		if(start!=null) {
			prev.next=start.next;
		}
			
		}
	
	public static Node insert(Node head,int ele) {
	if(head==null) {
		return new Node(ele);
	}
	
	if(head.next==null) {
		 head.next=new Node(ele);
	}
	else {
		insert(head.next,ele);
	}
	return head;
	}

}

class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}