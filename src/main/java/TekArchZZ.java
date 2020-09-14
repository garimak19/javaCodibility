import java.util.Scanner;
import java.util.Vector;

public class TekArchZZ {
String str;
	
Vector v=new Vector();

	
	public void addZ(int n) {
		while(n>0) {
			v.add(3,"Z");
			n--;
			
		}
		System.out.println(v);
		
	}
	public void deleteChar(int n) {
		int i=n+1;
		while(n>0) {
			v.remove(i);
			n--;
		}
		System.out.println(v);
		
	}
	public static void main(String[] args) {
		TekArchZZ t=new TekArchZZ();
		t.v.add("t");
		t.v.add("e");
		t.v.add("k");
		t.v.add("a");
		t.v.add("r");
		t.v.add("c");
		t.v.add("h");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number- ");
		int n=sc.nextInt();
		t.addZ(n);
		t.deleteChar(n);
		sc.close();

	}

}
