import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class stores{
	HashMap<String,Integer> map=new HashMap<String, Integer>();
	
	public void addDrink(String t,int q){
		map.put(t, q);
		
	}
	
	public void orderDrink(String t,Integer q) {
		
		int n=map.get(t);
		if(q<=n) {
		n=n-q;
		map.put(t, n);
		}
		else {
			System.out.println("Not enough Quantity available");
		}
		
	}
	public void printMap() {
		System.out.println();
		for(String e:map.keySet()) {
			System.out.println(e+" "+map.get(e));
		}
		System.out.println();
	}
}
public class StoreDrinks {

	public static void main(String[] args) {
		
		stores st=new stores();
		st.addDrink("Lemonade", 70);
		
		st.addDrink("AppleJuice", 60);
		st.addDrink("PinappleJuice", 50);
		st.addDrink("OrangeJuice", 90);
		st.addDrink("Coke", 100);
		
		st.printMap();
		
		st.orderDrink("AppleJuice", 20);
		
		st.printMap();
		st.orderDrink("OrangeJuice", 90);
		st.printMap();
		st.orderDrink("OrangeJuice", 10);
		st.printMap();
		
	}

}
