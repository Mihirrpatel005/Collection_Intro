package collection_prac;

import java.util.BitSet;

public class Bitset_test {

	public static void main(String[] args) {

		// work like 2^n power set bit 0 to 1....

		BitSet bs = new BitSet();
		for (int i = 0; i < 14; i++) {
			if (i % 2 == 0)
				bs.set(i);

		}

		BitSet b2 = (BitSet) bs.clone();
		bs.clear();
		System.out.println(bs.intersects(b2));

	}

}
