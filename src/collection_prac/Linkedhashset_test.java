package collection_prac;

import java.util.LinkedHashSet;

public class Linkedhashset_test {

	public static void main(String[] args) {

		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		
		for(int j=0;j<13;j++){
			System.out.print("  "+ls.add(j));		
		}
		System.out.println(ls.add(null));
		System.out.println(ls.add(null));
		System.out.println(ls);
		

	}

}
