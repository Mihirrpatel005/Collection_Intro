package collection_prac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Hash_Map {

	static HashMap<Integer, Integer> hm = new HashMap<>();

	static void addtest() {
		for (int name : hm.keySet()) {
			for (int i = 0; i < 50; i++) {

				int s = hm.get(name);
				hm.put(name, s + 1);
			}

		}

	}

	public static void main(String[] ar) throws InterruptedException {

		/*
		 * hm.put(null, null); hm.put(0, 1); hm.put(1, 1); hm.put(2, 2);
		 * hm.put(25, 25); hm.put(3, 3);
		 */

		int i;
		for (i = 0; i < 3; i++) {
			hm.put(i, 0);
		}

		System.out.println("test>>>>>>>"+hm);
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.submit(Hash_Map::addtest);
		service.submit(Hash_Map::addtest);
		service.submit(Hash_Map::addtest);

		service.awaitTermination(1, TimeUnit.SECONDS);
		service.shutdown();

		System.out.println(hm);

		Set<?> set = hm.entrySet();
		Iterator<?> it = set.iterator();
		while (it.hasNext()) {

			// it.remove();
			Map.Entry ob = (Map.Entry) it.next();
			// hm.put(16, 56);
			System.out.println(ob.getKey() + " " + ob.getValue());
		}

		hm.put(200, 45);
		System.out.println(hm);

		HashSet s1 = new HashSet<>();
		s1.add(1);
		s1.add(2);
		HashMap<HashSet<Integer>, HashSet<Integer>> hm = new HashMap<>();
		hm.put(s1, s1);
		System.out.println(hm);

	}
}
