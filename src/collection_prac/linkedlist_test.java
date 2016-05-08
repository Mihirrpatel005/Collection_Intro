package collection_prac;

import java.util.LinkedList;

public class linkedlist_test {

	public static void main(String[] args) {

		LinkedList<Integer> ls = new LinkedList<>();

		System.out.println(ls.size());

		for (int i = 0; i < 11; i++) {
			ls.add(i);

		}

		System.out.println(ls.size());
		System.out.println(ls);

	}

}
