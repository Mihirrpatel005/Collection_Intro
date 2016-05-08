package collection_prac;

import java.util.Vector;

public class vector_test {

	public static void main(String[] args) {

		Vector<Integer> vc = new Vector<>();

		for (int i = 0; i < 11; i++) {
			vc.add(i);

		}
		System.out.println(vc.remove(10));
		System.out.println(vc.remove(9));
		System.out.println(vc.remove(8));
		System.out.println(vc.remove(7));
		System.out.println(vc.remove(6));
		vc.trimToSize();
		System.out.println(vc);

	}

}
