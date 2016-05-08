package collection_prac;

import java.util.TreeSet;

public class Treeset_test {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<>();

		for (int i = 0; i < 14; i++) {
			System.out.print(ts.add(i) + "  ");
			// new element insert into treeset retuen true bcs defalut treemap is null after that fill 
			//pass the same element its return false and no change in order...
		}

		System.out.println(ts.headSet(7));
		
		System.out.println(ts.add(0));
		System.out.println(ts);

	}

}
