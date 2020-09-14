import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class vehicle implements Comparable<vehicle>{
	int vehicleNo;
	String vehicleModel;
	int pHour;
	vehicle(int n,String m,int h){
		vehicleNo=n;
		vehicleModel=m;
		pHour=h;
		
	}
	public int compareTo(vehicle o) {
		
		return this.pHour-o.pHour;
	}
}


public class ParkedVehicle {

	public static void main(String[] args) {
		
		List<vehicle> l1=new ArrayList<vehicle>();
		l1.add(new vehicle(10,"Audi",8));
		l1.add(new vehicle(20,"BMW",4));
		l1.add(new vehicle(30,"Toyota",10));
		
		List<vehicle> l2=new ArrayList<vehicle>();
		l1.add(new vehicle(50,"Audi",3));
		l1.add(new vehicle(40,"Mercedes",12));
		l1.add(new vehicle(60,"Tesla",20));
		
		l1.addAll(l2);
		Collections.sort(l1);
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i).vehicleNo+"  "+l1.get(i).vehicleModel+"  "+l1.get(i).pHour);
		}
		
		System.out.println("Hoghest parking hour car is "+ l1.get(l1.size()-1).vehicleModel+" "+(l1.get(l1.size()-1).pHour*60)+" minutes");
	}

}
