package collection_prac;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap_test {

	public static void main(String[] args) {

		final int MAX_ENTRIES = 11;

		LinkedHashMap lmap = new LinkedHashMap(MAX_ENTRIES + 1, 0.75f, true) {

			protected boolean removeEldestEntry(Map.Entry eldest) {
				return size() > MAX_ENTRIES;
			}
		};

		//lmap.put(null, null);
		for (int i = 0; i < 14; i++) {

			lmap.put(i, 0);
		}
		for (int i = 0; i < 14; i++) {
			if (i % 2 == 0) {
				lmap.put(i, 1);
			}

		}

		System.out.println(lmap);

	}

}
