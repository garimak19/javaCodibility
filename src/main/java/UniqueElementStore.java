import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UniqueElementStore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 numbers-");
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(sc.nextInt());
		for(int i=0;i<4;i++) {
			int n=sc.nextInt();
			if(list.contains(n)) {
				System.out.println("Duplicates Not Allowed");
			}
			else {
				list.add(n);
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		
		
	}

}
