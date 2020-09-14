import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student2 implements Comparable<student2>{
	String name;
	int regNo;
	int marks;
	student2(String n,int re,int m){
		name=n;
		regNo=re;
		marks=m;
		
	}
	
	public int compareTo(student2 o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	}
	
}



	
	


public class StudentRank {

	public static void main(String[] args) {
		List<student2> list=new ArrayList<student2>();
		list.add(new student2("A",1,90));
		list.add(new student2("B",3,60));
		list.add(new student2("C",4,50));
		list.add(new student2("D",2,80));
		list.add(new student2("E",5,78));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).marks);
		}
		int j=1;
		Collections.sort(list);
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i).name+" "+list.get(i).regNo +" awarded grade  "+j);
			j++;
		}

	}

}
