import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

class student1 {
	String name;
	 int regNo;
	public student1(String s,int n) {
		name=s;
		regNo=n;
	}
	public String toString() 
    { 
        return this.regNo+ " "
            + this.name + " ";
           
    } 
	
}
class Sortbyroll 
implements Comparator<student1> { 



public int compare(student1 o1, student1 o2) {
	// TODO Auto-generated method stub
	return o1.regNo-o2.regNo;
} 
} 
public class StudentTreeMap{
	

	public static void main(String[] args) {
	
		

	TreeMap<student1,Integer> map=new TreeMap<student1, Integer>(new Sortbyroll() );
	map.put(new student1("AA",1), 1);
	map.put(new student1("CC",8), 3);
	map.put(new student1("ZZ",4), 2);
	map.put(new student1("BB",5), 5);
	map.put(new student1("KK",2), 4);
	System.out.println(map);
	
}
}