import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class Student{

	String name;
	int id;
	
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public String toString() 
    { 
        return this.id+ " "
            + this.name + " ";
           
    }

	
	
}
class Sortbyid 
implements Comparator<Student> { 




public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o1.id-o2.id;
} 
} 
public class ProrityQStudent {
	static PriorityQueue<Student> pq;
	static void enqueue(Student s) {
		pq.add(s);
		
	}
	static void dequeue() {
		pq.remove();
		
	}
	public static void main(String[] args) {
		ProrityQStudent q=new ProrityQStudent();
		pq=new PriorityQueue<Student>(new Sortbyid() );
		Student s1=new Student("garima",11);
		Student s2=new Student("gamy",2);
		Student s3=new Student("sunny",31);
		Student s4=new Student("arin",1);
		Student s5=new Student("arika",55);
		
		q.enqueue(s1);
		q.enqueue(s2);
		q.enqueue(s3);
		q.enqueue(s4);
		q.enqueue(s5);
		
		
		Iterator it=pq.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		q.dequeue();
		System.out.println(pq);
	}
	

}
