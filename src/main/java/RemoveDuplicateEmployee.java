import java.util.ArrayList;

class Employee{
	String eName;
	int eNo;
	
	Employee(String name , int no){
		eName=name;
		eNo=no;
	}
	
	
}


public class RemoveDuplicateEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> arrList=new ArrayList<Employee>();
		arrList.add(new Employee("arin",1));
		arrList.add(new Employee("arika",11));
		arrList.add(new Employee("nim",10));
		arrList.add(new Employee("arin",1));
		arrList.add(new Employee("gabe",07));
		arrList.add(new Employee("gabe",07));
		
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i).eName+"  "+arrList.get(i).eNo);
		}
		
		System.out.println();
		
		for(int i=0;i<arrList.size();i++) {
			for(int j=i+1;j<arrList.size();j++) {
				
				if(arrList.get(i).eNo==arrList.get(j).eNo) {
					arrList.remove(j);
				}
			}
		}
		
		for(int i=0;i<arrList.size();i++) {
			System.out.println(arrList.get(i).eName+"  "+arrList.get(i).eNo);
		}
		
	}

	
	
	
}
