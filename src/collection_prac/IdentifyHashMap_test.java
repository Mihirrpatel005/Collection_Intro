package collection_prac;

import java.util.IdentityHashMap;
import java.util.Iterator;

public class IdentifyHashMap_test {

	public static void main(String[] args) {
		// default 64 linear probing...
		// its use the compare method using reference equality k1==k2

		item it = new item(1, "mihir");
		item it1 = new item(1, "mihir");
		IdentityHashMap<item, Integer> idmap = new IdentityHashMap<>();

		for (int j = 0; j < 5; j++) {
			idmap.put(it, j);
		}
		idmap.put(it1, 2);
		Iterator<item> idit = idmap.keySet().iterator();
		while (idit.hasNext()) {
			item i1 = idit.next();
			System.out.println(i1.id + " " + i1.getName() + idmap.get(i1));
		}
		System.out.println(System.identityHashCode(it) == System.identityHashCode(it));
		System.out.println(idmap);

	}

}
