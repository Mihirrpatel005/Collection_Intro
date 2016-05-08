package collection_prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Arraylist_test {

	public static void main(String[] args) {

		String[] wordArray = { "Love Yourself", "Alive is Awesome", "Be in present" };
		ArrayList<String> wordlist = new ArrayList<>(Arrays.asList(wordArray));
		System.out.println(wordlist.get(1));

		ArrayList<Integer> al = new ArrayList<>();

		System.out.println(al.size());

		for (int i = 0; i < 11; i++) {
			al.add(i);
		}
		System.out.println(";;;" + al.size());
		al.trimToSize();
		al.add(11);
		System.out.println(";;;" + al.size());

		System.out.println(al.set(0, 100));

		al.remove(5);
		Collections.reverse(al);
		System.out.println(al);

	}

}
