package collection_prac;

import java.util.HashSet;

public class Hashset_test {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < 14; i++) {
			System.out.print(hs.add(i) + "  ");
		}

		
		System.out.println(hs.add(null));
		System.out.println(hs.add(null));
		System.out.println(hs);

	}

}
